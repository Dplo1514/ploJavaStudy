import java.util.Scanner;

public class part_12_5_break {
    public static void main(String[] args) {
        String password = "abd123";
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("password를 입력해주세요.");
            input = scanner.nextLine();

            if (input.equals(password)){ //입력받은 값이 password와 동일하면 코드블럭의 반복을 멈춤 break;
                System.out.println("비밀번호가 일치합니다.");
                break;
            }

        }while (true);
    }
}
