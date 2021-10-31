import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class part_15_2_fileOutPut {
    public static void main(String[] args) {
        FileWriter fileWriter = null; //try block 외부에서 fileWriter함수를 사용하기 위한 null값 선언
        try {
            fileWriter = new FileWriter("src/part_15_2_file_output",true); //new FileWriter(경로 / 생성할 파일명)
            //FileWriter의 기본옵션은 파일을 덮어쓰게된다. //FileWriter(경로/생성파일명 , true)값을 주게되면 파일의 이어쓰기가 가능하다
        } catch (IOException e) {
            System.out.println("file 생성에 실패했습니다."); //예외가 발생하였을 때에 출력할 문장
            System.exit(1); //시스템이 종료될 때 출력될 exit code이며 1 = 프로그램이 정상종료되지 않았음을 의미함
        }

        try {
            fileWriter.write("\n test file input"); //생성된 파일에 입력할 텍스트 내용
            fileWriter.write("\n test file input22");
            fileWriter.close(); //write 후 파일을 close해주어야 정상적으로 파일에 내용이 입력됨
        }catch (IOException e){
            System.out.println("file Data 입력에 실패하였습니다.");
            System.exit(2); //시스템이 종료될 때 출력될 exit code이며 1 = 프로그램이 정상종료되지 않았음을 의미함
        }
    }
}
