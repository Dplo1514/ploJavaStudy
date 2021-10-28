public class part_12_4_doWhile {
    public static void main(String[] args) {
        int i = 1; //i의 값 지정

        do { //while 조건이 true일 때에 실행할 코드블럭
            System.out.println(i);
            i++;
        }while (i < 10); //i가 10보다 작은 동안 do 코드블럭을 반복
    }//do-while문은 while안의 조건이 false이더라도 무조건 한번은 실행된다.
}
