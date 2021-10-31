import java.io.FileWriter;
import java.io.IOException;
import java.text.FieldPosition;

public class part_15_3_fileOutPut2 {
    public static void main(String args[]) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("src/part_15_3_fileOutput2");
        }catch (IOException e) {
            System.out.println("File 생성에 실패하였습니다");
            System.exit(1);
        }

        try{
            fileWriter.write("");
        } catch (){

        }
    }
}
