import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class part_15_test_memo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("원하는 작업 번호를 입력해주세요");
            System.out.println("1 : 메모 읽기");
            System.out.println("2 : 메모 쓰기");
            System.out.println("3 : 파일 종료");

            int tasknum;

            try {
                String input = scanner.nextLine();
                tasknum = Integer.parseInt(input);
            }catch (NumberFormatException e){
                System.out.println("숫자를 입력해 실행하여 주십시오");
                continue;
            }

            if (tasknum == 1){
                System.out.println("메모 파일명을 입력하세요");
                String filename = scanner.nextLine();
                try {
                    FileInputStream fileInput = new FileInputStream(filename);
                }catch (FileNotFoundException e) {
                    System.out.println("파일이 존재하지 않습니다.");
                    continue;
                }
                System.out.println("fileName + 내용을 출력합니다.");

                Scanner reader = new Scanner(filename);

                while (reader.hasNextLine());{
                    System.out.println(reader.hasNextLine());
                }
                System.out.println("\n");
                reader.close();
            }

        }
    }
}