import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class part_19_map {
    public static void main(String[] args) {
        /*Map<String,String> english = new HashMap<>(); //Map<Key의 data type , value의 data type> = new Hashmap<>()

        english.put("사과","apple"); //map.put(key 값,value 값)
        english.put("시계","watch");
        english.put("노트북","notebook");
        //map.remove(key 값) 맵의 인덱싱된 key값을 삭제한다.

        System.out.println(english);
        System.out.println(english.get("사과")); //map.get(key값) 으로 인덱스가 가능하다.
*/
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("과자","snack");
        dictionary.put("사과","apple");
        dictionary.put("파인애플","pineapple");
        dictionary.put("복숭아","peach");
        dictionary.put("키위","kiwi");
        System.out.println(dictionary.size() + "개의 단어가 존재합니다.");
        System.out.println("찾으실 한글을 입력해주세요");
        System.out.println("exit입력시 종료됩니다.");


        while (true) {
            Scanner scanner = new Scanner(System.in);
            String english = scanner.nextLine();
            String korea = dictionary.get(english);

            if (korea == null) {
                System.out.println("사전에 입력 값이 존재하지 않습니다.");
            }else{
                System.out.println(korea + "=" + english + "입니다.");
            }
        }
    }
}