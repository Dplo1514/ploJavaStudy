import java.util.Scanner;

public class part_11_StringCompare {
    public static void main(String[] args) {
        //문자열의 비교

        String apple = "apple";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("정답입니다." + apple.equals(input)); //String type의 boolean연산은 비교 값.equals(비교 값)
    }
}