import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class part_18_4_collection4 {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("치킨");
        list.add("피자");
        list.add("골뱅이");
        /*
        for (String food : list){ //for each문을 통한 리스트의 객체를 한번씩 순회하는 메서드
            System.out.println(food + "먹고싶다");
        }*/

        /*if (list.size() == 0){ //list.size() 목록에 존재하는 값 개수확인
            System.out.println("목록이 비어있습니다.");
        }else {
            System.out.println("목록에" + list.size() + "개의 값이 존재합니다.");
            System.out.println("목록 값을 하나씩 출력합니다.");

            for (String food : list){
                System.out.println(food + " 존재합니다.");
            }
        }*/

        if (list.isEmpty()){ //목록이 비어있는지의 여부를 boolean 값으로 반환
            System.out.println("목록이 비어있습니다.");
        }else {
            System.out.println("목록이 비어있지 않습니다.");
        }
    }
}
