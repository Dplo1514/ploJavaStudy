import java.util.Scanner;

/*import java.util.Scanner;

public class part_8_input_intiger {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해주세요");
        Scanner scanner = new Scanner(System.in); //Scanner type scanner 변수에 new Scanner함수 (표쥰입력 값 설정)
        String intInput = scanner.nextLine(); //문자열 타입에 intInput 변수에 scanner변수.nextline() 한줄씩 출력 함수

        System.out.println(intInput + 1); //문자열 타입이기에 연산자를 사용해도 수를 더하는 것이 아닌 끝자리에 1을 더하는 문자열의 연산수행
    }
}*/
public class part_8_2_input_intiger {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();

        int intvalue = Integer.parseInt(intInput);
        //입력받은 문자열을 파라미터로 넘겨주게 되면 int type으로 변환함(parseInt) 데이터 변환을 위하여 wrapper type data 사용

        System.out.println(intvalue + 1); //int type intvalue의 parseInt(inInput)이 정상작동하여 전과 다르게 산술연산 후 출력됨
    }
}