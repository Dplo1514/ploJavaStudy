import java.util.Random;

public class part_14_8_test_randomIntiger {
    public static void main(String[] args) {
        Random random = new Random(); //Random type의 random객체 생성 = new Random(); 새로운 랜덤 값 추가
        int randomNumber = random.nextInt(100); //int type의 randomNumber 객체 생성 random.nextInt(int 범위)

        System.out.println(randomNumber);
    }
}
