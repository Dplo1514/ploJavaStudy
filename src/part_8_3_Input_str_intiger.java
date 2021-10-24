import java.util.Scanner;

public class part_8_3_Input_str_intiger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("달러 환율을 입력하세요.");
        String exchangeString = scanner.nextLine();

        System.out.println("치킨 값을 입력하세요");
        String exchangeString2 = scanner.nextLine();

        try {
            double doller = Double.parseDouble(exchangeString); //환율은 소수가 포함된 실수이기에 Double 자료형을 사용함
            double chicken = Double.parseDouble(exchangeString2);
            System.out.println("치킨 값은" + chicken / doller + "입니다."); //치킨의 가격을 달러환율로 나눠 치킨의 달러가격을 출력
        } //사용자가 예외행동을 할 요소가 있는 코드블럭을 try 구문으로 묶는다.

        catch (Exception e) {// Exception : 예외 (지정되지 않음)
            System.out.println("숫자를 입력해주세요");
        } //사용자가 예외활동을 하였을 때 실행할 코드를 catch (예외활동으로 인하여 발생할 오류) {중괄호 안에 코드 입력}

    }
}
