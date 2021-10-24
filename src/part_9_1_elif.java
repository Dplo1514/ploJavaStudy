public class part_9_1_elif {
    public static void main(String[] args) {
        //과일 두개를 먹게하라 (else if문 코드블럭에서)
        int apple = 50;
        int kiwi = 50;

        if(kiwi > apple) { //false 이기에 else if 코드블럭으로 이동
            System.out.println("kiwi so expensive");
        }

        else if(apple == kiwi ){ //true 이기에 else if 코드블럭이 실행
            System.out.println("I'll take it all");
        }

        else{ // else if 코드블럭이 실행되었기에 무시
            System.out.println("I don't like kiwi and apple");
        }
    }
}
