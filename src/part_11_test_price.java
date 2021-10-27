import java.util.Scanner;

public class part_11_test_price {
    public static void main(String[] args) {
        System.out.println("음식 이름을 입력해주세요");
        Scanner scanner = new Scanner(System.in); //사용자에게 입력 값을 받을 스캐너 생성

        String name = scanner.nextLine(); //name객체에 스캐너 지정

        switch (name) { //name객체에 사용자가 입력한 값에 따라 각기 다른 출력을 가능케하는 case 함수 사용
            case "치킨" :
                System.out.println("치킨은 18000원 입니다.");
                break;
            case "순대국" :
                System.out.println("순대국은 8000원 입니다.");
                break;
            case "스테이크" :
                System.out.println("스테이크는 5000원 입니다.");
                break;

            default: // case 외 입력값에 대응하는 출력값 지정
                System.out.println("메뉴에 존재하는 음식을 입력해주세요");
        }
    }
}
