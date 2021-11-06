public class part_16_method {
    public static void main(String[] args) {
        sayhello(); //sayhello() 메서드를 호출해주는 것 만으로도 해당 메서드의 기능이 동작

        sayhello2("plo"); //해당 메서드 타입에 맞는 인자(매개변수)를 입력 후 호출시 메서드 기능이 동작

        plus(5 , 10);

        int result = sum(5,10); //리턴 값이 있는 메서드이기 때문에 객체화
        System.out.println(result);

        int[] multiadd = sumAndProduct(5,4); //리턴 값이 있는 배열형 메서드이기에 배열로 객체화
        System.out.println("sum = " + multiadd[0]);
        System.out.println("prduct = " + multiadd[1]);
    }

    public static void sayhello(){ //hello를 출력해주는 메서드 생성
        System.out.println("hello");
    }

    public static void sayhello2(String name) {//name을 인자로 작동하는 sayhello2메서드 생성
        System.out.println("hello" + name);
    }
    public static void plus(int a , int b){ //매개변수는 int type의 a ,b
        System.out.println(a + "+" + b +  "=" + (a+b)); //매개변수 a 와 b를 합한 값을 프린트하는 메서드
    }

    public static int sum (int a , int b){ //String , int boolean은 return 값이 존재 void는 리턴값이 존재하지 않는다.
        return a+b; //return값은 매개변수 a + b
    }

    public static int[] sumAndProduct (int a , int b) { //int[] type의 메서드 생성 인자는 int type의 배열
        int sum = a + b;
        int product = a * b;

        int[] result = {sum , product}; //result 배열의 0번째 요소는 int a + int b  , 1번째 요소는 int a * int b

        return result; //반환 값은 result 배열
    }
}
