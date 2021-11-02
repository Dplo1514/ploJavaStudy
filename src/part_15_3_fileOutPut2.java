import javax.sound.midi.Soundbank;
import java.io.FileWriter;
import java.io.IOException;
import java.text.FieldPosition;
import java.util.Scanner;

public class part_15_3_fileOutPut2 {
    public static void main(String args[]) {
        FileWriter fileWriter = null; //try블럭 밖에서 fileWriter 객체의 사용을 위한 null값 선언

        try {
            fileWriter = new FileWriter("src/part_15_3_fileOutput2",true);
            //FileWriter("생성위치/파일의 이름" , true //이어쓰기 허용) //파일의 입력 - 입력 값을 새로운 파일로 생성

        }catch (IOException e) {
            System.out.println("File 생성에 실패하였습니다");
            System.exit(1); //예외시 작동할 코드
        }

        System.out.println("입력을 종료하려면 Enter키를 눌러주세요"); //사용자에게 종료방법 전달
        Scanner scanner = new Scanner(System.in); //사용자에게 값을 입력받을 스캐너 생성

        while (true){ //여러줄을 입력받기위한 반복문 생성
            String input = scanner.nextLine(); //사용자에게 값을 입력받음

            if (input.equals("")){ //사용자의 입력값이 ""일 때에 반복문을 탈출
                System.out.println("파일입력을 종료합니다.");
                break;
            }

            try{
                fileWriter.write(input + "\n"); //사용자의 내용 입력을 파일에 적용
            } catch (IOException e){
                System.out.println("내용입력이 정상실행되지 않았습니다.");
                System.exit(2);
            }
        }

        try {
            fileWriter.close(); //반복문의 탈출 후 fileWriter의 종료를 위하여 반복문 바깥에서 선언
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일닫기에 실패했습니다.");
        }
    }
}
