import java.util.Scanner;

public class part_12_test_password {
    public static void main(String[] args) {
        String password = "abc1234"; //password 정의
        Scanner scanner = new Scanner(System.in); //스캐너 생성성
        System.out.println("password를 입력해주세요"); //사용자에게 패스워드 입력요청
        String input = scanner.nextLine(); //input 객체 : 사용자로부터 패스워드를 입력받음

        while (input.equals(password) !=true){ //while문 조건 : input을 이용하여 사용자에게 입력받은 값이 password와 같지않다면
                                                // ! = not 연산자 true가 아니라면 코드블럭을 실행

            System.out.println("비밀번호를 입력해주세요."); //일치하지 않을시 출력 문구
            input = scanner.nextLine(); //일치하지 않을시 다시한번 사용자에게 입력을 요구
        }

        System.out.println("비밀번호가 일치합니다.");
    }
}
