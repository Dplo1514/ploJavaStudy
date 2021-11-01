import java.io.FileWriter;
import java.io.IOException;
import java.text.FieldPosition;
import java.util.Scanner;

public class part_15_3_fileOutPut2 {
    public static void main(String args[]) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("src/part_15_3_fileOutput2",true);
        }catch (IOException e) {
            System.out.println("File 생성에 실패하였습니다");
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try{
            fileWriter.write(input);
            fileWriter.close();
        } catch (IOException e){
            System.out.println("내용입력이 정상샐행되지 않았습니다.");
            System.exit(2);
        }
    }
}
