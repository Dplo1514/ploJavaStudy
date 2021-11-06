import java.util.ArrayList;
import java.util.List;

public class part_18_collection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //List<wrapper data type> = new ArrayList<>()
        List<Integer> list2 = new ArrayList<Integer>(); //List<wrapper data type> = new ArrayList<>(Lapper data type)
        ArrayList<Integer> list3 = new ArrayList<>(); //ArrayList<wrapper data type> = new ArrayList<>()

        list.add("0");
        list.add("1");
        list.add("2"); //list에 값을 추가함

        /*list.remove("0"); //list에 값을 삭제함
        list.remove(1); //list에 인덱스 값을 삭제함*/

        list.set(1,"15"); //list에 값을 변경함 set(index , 변경값)
        System.out.println(list);
        System.out.println(list.get(1)); //list.get(index) : 리스트 인덱싱

        String listIndex = list.get(0); //list.get을 통하여 인덱스된 값의 객체 지정이 가능하다.
        System.out.println(listIndex);

        boolean contains = list.contains("100"); //list에 특정 값의 존재여부를 확인 list.contains(찾을 값) boolean type
        System.out.println(contains);
    }
}
