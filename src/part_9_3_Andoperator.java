public class part_9_3_Andoperator {
    public static void main(String[] args) {
        int age = 20;
        if(age >= 20 && age < 30) { //&&은 양쪽의 조건 모두가 true일 때에 true이며 두 조건중 하나라도 false이면 false이다. (and연산)
            System.out.println("He is twenty!!");
        }
        else {
            System.out.println("He is not twenty!!");
        }
    }
}
