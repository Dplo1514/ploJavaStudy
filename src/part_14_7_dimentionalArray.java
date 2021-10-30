import java.util.Arrays;

public class part_14_7_dimentionalArray {
    public static void main(String[] args) {
        int[][] array = { //dataType[][] : 2차원 배열 생성
                {1,2,3,4,5} , //2차원 배열은 배열의 {{},{},{}} 형태로 생성되며 ,를통하여 배열을 구분한다.
                {6,7,8,9,10} ,
                {11,12,13,14,15}};

        System.out.println(Arrays.toString(array[0])); //2차원 배열의 출력은 array[출력할 배열의 위치 값]
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));
    }
}
