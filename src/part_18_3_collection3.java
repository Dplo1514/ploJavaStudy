import java.util.*;

public class part_18_3_collection3 {
    public static void main(String[] args) {
        List<String> dogs = Arrays.asList("뽀삐" ,"로또" ,"럭키" ,"나비" , "복실이"); //list의 인자를 더함 Arrays.asList(인자,인자)
        System.out.println(dogs);

        Set<String> food = new HashSet<>(); //Set은 List와 달리 중복값을 허용하지 않는다. / list와 달리 인덱스가 불가능하다.
        food.add("pizza");
        food.add("checkin");
        food.add("pizza");
        food.add("checkin");

        System.out.println(food);
    }
}