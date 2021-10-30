public class part_14_9_test_threadSleep {
    public static void main(String[] args) {
        System.out.println("Just a moment please");

        try {
            Thread.sleep(3000); //thread.sleep(시간) : 지정된 시간 동안 메서드를 잠깐 정지함
        } catch (InterruptedException e) { //예외 지정
            e.printStackTrace(); //메소드가 내부적으로 예외 결과를 출력함
        }
        System.out.println("got cha!");
    }
}
