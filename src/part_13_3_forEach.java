import java.lang.reflect.Array;
import java.util.Arrays;

public class part_13_3_forEach {
    public static void main(String[] args) {
        String[] apple = {"Mac" , "Watch" , "Pad" , "Phone" , "Mini"};

        for(String app : apple);{ //for-each (배열객체의 자료형 현재 객체명 : 반복을 적용할 배열)
            System.out.println(apple + "want");
        }
    }
}
