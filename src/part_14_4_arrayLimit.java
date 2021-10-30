public class part_14_4_arrayLimit {
    public static void main(String[] args) {
        String[] Limit = {"배" , "열" , "의" , "한" , "계"};
        System.out.println(Limit[7]); //배열의 요소는 0~4이지만 이보다 높은 수를 출력하려하면 예외가 발생함
        Limit[7] = "!!"; //배열의 값보다 큰 요소에 배열을 추가하려하면 예외가 발생함
    }
}
