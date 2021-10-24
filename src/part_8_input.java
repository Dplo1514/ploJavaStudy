/*import java.util.Scanner;

public class part_8_input {
    public static void main(String[] args) {
        Scanner scanner; //Scanner type 의 변수 scanner를 할당
        scanner = new Scanner(System.in); //scanner type data는 new Scanner값 생성 후 system.in이라는 표준입력 인터페이스 지정
        String input = scanner.nextLine(); //nextLine 함수 이용하여 사용자가 키보드로 문자열 타입을 반환받을 수 있다.
        System.out.println(input);
    }
}*/

import java.util.Scanner;

public class part_8_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next(); //scanner next는 띄어쓰기 단위로 문자가 분할되어 출력됨.
        String input1 = scanner.next();
        String input2 = scanner.next();

        System.out.println(input);
        System.out.println(input1);
        System.out.println(input2);

    }
}