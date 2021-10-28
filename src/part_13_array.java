public class part_13_array {
    public static void main(String[] args) {
        String[] week = {"월" , "화" , "수" , "목" , "금" , "토" , "일"}; //배열은 type[] array = {a , b , c} 생성
        int b = 0;
        System.out.println(week[1]); //배열의 2번째 리터럴 출력
        System.out.println(week.length + "\n"); //week배열의 길이 출력

        for (int i = 0 ; (i < week.length); i++){ // (int i = 0 ; i가 week배열의 길이보다 작은동안 , i에 1씩 더하라)
            System.out.println(week[b]);
            b++;
        }
    }
}
