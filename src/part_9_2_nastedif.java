public class part_9_2_nastedif {
    public static void main(String[] args) {
        //10대를 추려내는 if문을 만들어라
        int age = 10;
        int age2 = 19;

        if (age >= 10){
            if (age2 < 20){
                System.out.println("10대입니다.");
            }
        }else {
            System.out.println("10대가 아닙니다.");
        }
    }
}
