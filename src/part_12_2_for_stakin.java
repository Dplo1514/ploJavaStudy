public class part_12_2_for_stakin {
    public static void main(String[] args) {
        for (int i = 2; (i < 10); i++) { // for(i=2; i가 10보다 작은동안 / i에 1씩 더하라)
                for (int j = 1; (j < 10); j++) { //for(j=1; j가 9보다 작은동안 /j에 1씩 더하라)
                    System.out.println(i + "*" + j + "=" + i * j); // i * j
                }
            }
        }
    }
