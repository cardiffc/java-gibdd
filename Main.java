import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] letters = {"A AA", "B BB","E EE","K KK","M MM","H HH","O OO","P PP","C CC","T TT","У УУ","X XX"};
        ArrayList<Integer> regions = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        int count = 0;

        for (int i = 1; i <= 198 ; i++) {
            regions.add(i);

        }

        for (int i = 1; i <= 999 ; i++) {
            if (i % 111 == 0) {
                numbers.add(i);

            }
        }

        for (int k = 0; k < regions.size() ; k++) {
            for (int i = 0; i < numbers.size(); i++) {
                for (int j = 0; j < letters.length; j++) {
                    System.out.println(letters[j].replaceAll(" ", numbers.get(i).toString()) + regions.get(k).toString());
                    count++;
                }

            }
        }
        HashSet<String> coolNumber = new HashSet();


         System.out.println(count);
    }
}