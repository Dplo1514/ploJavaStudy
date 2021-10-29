import java.util.Arrays;

public class part_14_2_array_change {
    public static void main(String[] args) {
        String[] menu = {"치킨" ,"파스타" ,"감바스" ,"피자" ,"햄버거"};
        menu[0] = "콜라"; //배열의 요소번호를 인덱스 후 변경값을 지정하면 변경됨.

        System.out.println(Arrays.toString(menu)); //Arrays.toString : 자바의 String 배열이 제대로 출력되지 않을 때
    }
}
