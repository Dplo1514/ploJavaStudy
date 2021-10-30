import java.util.Arrays;

public class part_14_5_array_plus {
    public static void main(String[] args) {
        int[] weeks = {1 ,2 ,3 ,4 ,5 }; //배열 생성
        int[] weeksPlus = Arrays.copyOf(weeks , 6); //Arrays.copyOf : (복제할 배열 , 배열의 길이)
        weeksPlus[5] = 6; //weeksPlust 배열의 5번째 값을 6으로 지정

        for (int day : weeksPlus){ //day객체에 weeksPlus배열 지정
            System.out.println(day);
        }
    }
}
