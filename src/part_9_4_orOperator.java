public class part_9_4_orOperator {
    public static void main(String[] args) {
        //20대가 아닌값의 조건식을 만들어 출력하라
        int age = 31;

        if (age < 19 || age >= 30) { //19보다 작거나 , 30보다 크거나 같다. // ||논리연산자는 두 조건값중 하나만 true여도 true값이 출력됨
            System.out.println("He is not twenty");
        }
        else {
            System.out.println("He is twenty");
        }
    }
}
