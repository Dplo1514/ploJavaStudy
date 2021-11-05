public class part_16_method {
    public static void main(String[] args) {
        sayhello(); //sayhello() 메서드를 호출해주는 것 만으로도 해당 메서드의 기능이 동작
        sayhello2("plo"); //해당 메서드 타입에 맞는 인자를 입력 후 작동시 메서드 기능이 동작
    }

    public static void sayhello(){ //hello를 출력해주는 메서드 생성
        System.out.println("hello");
    }

    public static void sayhello2(String name) {//name을 인자로 작동하는 sayhello2메서드 생성
        System.out.println("hello" + name);
    }
}
