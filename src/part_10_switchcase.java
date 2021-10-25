public class part_10_switchcase {
    public static void main(String[] args) {
        int week = 6;

        switch (week) { //switch-case 문법은 사용자의 다양한 입력에따라 결과값을 출력하는 if문의 쉽고 깔끔한 형태 break가 존재하지 않을시 다음 코드를 실행해버림 ex) case 1 - no break - case 2
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wenseday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;

            default: //사용자가 입력한 값이 case에 존재하지 않을시 default구문이 작동함
                System.out.println("Weekend!");
        }
    }
}
