import java.util.*;

public class part_18_2_collection2 {
    public static void main(String[] args) {
        List<String> tech = new ArrayList<>(); //String인자가 들어가는 리스트 생성
        Scanner scanner = new Scanner(System.in);
        System.out.println("리스트의 작성이 완료되었으면 0을 입력해주세요");

        while (true){
            String tech1 = scanner.nextLine();

            if (tech1.equals("0")){ //입력 값이 0일 때에 프로그램 종료
                break;
            }
            if (tech.contains(tech1)){ //리스트에 입력 값과 같은 내용이 존재한다면 "이미 목록에 있습니다" 출력
                System.out.println("이미 목록에 있습니다.");
            }else {
                tech.add(tech1); //존재하지 않는다면 리스트에 입력 값 인자로 추가
            }
        }
        Collections.sort(tech); //리스트의 오름차순 정렬
        Collections.reverse(tech); //리스트의 정렬을 뒤집음
        Collections.shuffle(tech); //리스트의 정렬을 랜덤하게 섞음

        System.out.println(tech);
    }
}