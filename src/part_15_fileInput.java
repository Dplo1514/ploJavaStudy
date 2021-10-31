import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class part_15_fileInput {
    public static void main(String[] args) {

        FileInputStream inputStream = null; //try블럭 바깥에서 inputStream객체를 사용하기 위하여 null값을 객체에 지정
                                            //FileInputStream : 파일을 읽어오기 위한 데이터타입
        try {
            inputStream = new FileInputStream("/Users/lop/Desktop/ploJavaStudy/src/part_15_file");
            //예외발생 가능성이 있기 때문에 try블럭 안에서 지정 값 선언 //new FileInputStream : FileInputStream(파일경로)
        } catch (FileNotFoundException e) { //파일을 찾을 수 없는 예외에 대응
            e.printStackTrace(); //에러발생의 근원지를 찾 단계별로 에러를 출력합니다.
        }

        Scanner scanner = new Scanner(inputStream); //inPutStream에 FileInputStream 경로를 통하여 지정된 파일을 스캔할 스캐너 생성

        while (scanner.hasNextLine()){ //hasNextLine 다음에 읽을 값이 있는지 확인하는 boolean type메소드 다음에 읽을 값이 존재하면 true
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
