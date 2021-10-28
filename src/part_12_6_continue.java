import java.util.Scanner;

public class part_12_6_continue {
    public static void main(String[] args) {
        for (int i =0 ; (i<10) ; i++) { //i=0 ; i가 10보다 작으면 ; i에 1을 더해주며 반복
             if (i % 2 == 0){ //만일 i를 2로 놔눴을 때에 0이면 (짝수이면)
                continue; //continue 계속 진행한다.
            }
            System.out.println(i);
        }
    }
}
