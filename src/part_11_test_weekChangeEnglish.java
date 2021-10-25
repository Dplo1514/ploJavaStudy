import java.util.Scanner;

public class part_11_test_weekChangeEnglish {
    public static void main(String[] args) {
        System.out.println("월을 입력하세요");
        Scanner scanner = new Scanner(System.in); //사용자와 상호작용 가능한 스캐너 생성

        int month; //int값의 month 객체 생성

        try{ //사용자의 잘못된 입력으로 발생할 수 있는 예외 코드블럭
            String input = scanner.nextLine(); //String type을 입력받는 스캐너를 생성 (사용자는 Stirng type을 입력하기 때문)
            month = Integer.parseInt(input);  //사용자가 입력한 String type data를 int type으로 변환
        } catch (Exception e) { //사용자가 예외행동을 하였을 때 실행할 코드블럭
            month = -1;
        }



        if(month == 1){
            System.out.println("January");
        } else if (month == 2){
            System.out.println("February");
        } else if (month == 3){
            System.out.println("March");
        } else if (month == 4){
            System.out.println("April");
        } else if (month == 5){
            System.out.println("May");
        } else {
            System.out.println("1부터 5까지만 입력 가능합니다.");
        }


    }
}
