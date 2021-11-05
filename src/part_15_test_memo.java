import java.io.*;
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
                FileInputStream fileInput = null;

                try {
                    fileInput = new FileInputStream(filename);
                }catch (FileNotFoundException e) {
                    System.out.println("파일이 존재하지 않습니다.");
                    continue;
                }
                System.out.println(filename + "내용을 출력합니다.");

                Scanner reader = new Scanner(fileInput);

                while (reader.hasNextLine()){
                    System.out.println(reader.nextLine());
                }

                System.out.println("\n");
                reader.close();
                }

            //메모 생성 및 쓰기
            else if(tasknum == 2){
                System.out.println("저장할 메모 파일명을 입력하세요");
                String filename = scanner.nextLine();

                FileWriter writer = null;

                try {
                    writer = new FileWriter(filename);
                } catch (IOException e) {
                    System.out.println("파일생성이 정상적으로 되지 않았습니다.");
                    continue;
                }

                System.out.println("메모에 저장할 내용을 입력해주세요");
                System.out.println("입력없이 엔터시 메모가 종료됩니다.");

                while (true){
                    String input = scanner.nextLine();

                    try{
                        writer.write(input);
                        writer.write("\n");
                    }catch (IOException e){
                        System.out.println("내용 입력이 정상적으로 처리되지 않았습니다.");
                        continue;
                    }

                    if (input.equals("")){
                        break;
                    }
                }
                try {
                    writer.close();
                    System.out.println("메모가 정상적으로 생성되었습니다.");
                }catch (IOException e) {
                    System.out.println("프로그램이 정상종료되지 않았습니다.");
                }
            }

            else  if(tasknum == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}