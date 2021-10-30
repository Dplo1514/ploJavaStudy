import java.util.Random;
import java.util.Scanner;

public class part_14_10_test_randomIntGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //새로운 스캐너 생성

        Random random = new Random(); //랜덤값을 생성하는 객체지정
        int randomint = random.nextInt(6); //random값을 입력받을 객체 지정

        for (int i = 0; i < 6; i++){
            System.out.println("숫자를 하나 입력해주세요");
            System.out.println(5 - i + "의 기회가 남았습니다");

            try {
                int input = scanner.nextInt(); //사용자로부터 입력값을 받음
                //int inputNumber = Integer.parseInt(input) //randomint 과 비교하기 위해 inputnumber를 int값으로 변환해줌 nextline사용할 경우
                if (randomint == input) {
                    System.out.println("Congraturation player win!!");
                    break;
                }
                else if (i ==5) {
                    System.out.println("Player lose hahaha!!");
                }
                else if(randomint > input) { //사용자 입력 값이 랜덤값보다 작을 경우
                    System.out.println("up");
                }
                else if(randomint < input){ //사용자 입력 값이 랜덤값보다 클 경우
                    System.out.println("down");
                }

            }catch (Exception e){
                System.out.println("숫자를 입력해주세요!!");
                break;
            }



        }
    }
}
