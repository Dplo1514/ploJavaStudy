import java.util.Random;
import java.util.Scanner;

public class part_17_test_randomIntGame {
    public static int randomInt; //int type 메서드 randomInt 선언
    public static Scanner scanner = new Scanner(System.in); //입력 값을 받을 메서드 scanner 선언

    public static void main(String[] args) {
        Random random = new Random(); //random 객체 선언
        randomInt = random.nextInt(256); //randomInt의 초기화 및 범위값 설정

        int atempt = 0; //플레이어의 도전 횟수로 사용될 객체 선언

        while (atempt < 8){ //atempt가 8보다 작을 때에 반복
            boolean life = play(); //boolean type의 life객체 값을 play 메서드로 지정

            if (life){ //life가 true이면 반복문 탈출
                break;
            }
            atempt++; //life가 true가 아닐 경우 atempt에 1을 더함
            System.out.println(atempt + "회 시도하였습니다.");
        }
        System.out.println("게임을 종료합니다.");
    }
    public static boolean play(){ //사용자의 입력 값과 randomInt를 비교할 메서드 play 선언
        System.out.println("숫자를 입력하여 주세요");
        int input = scanner.nextInt(); //입력 값을 받을 input 선언

        if (input == randomInt){
            System.out.println("축하합니다 player win");
            return true;
        }else if (input < randomInt) {
            System.out.println("up");
        }else if (input > randomInt) {
            System.out.println("down");
        }return false;
    }
}

