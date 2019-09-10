import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] letters = {"A AA", "B BB","E EE","K KK","M MM","H HH","O OO","P PP","C CC","T TT","У УУ","X XX"};
        ArrayList<String> regions = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        HashSet<String> coolNumber = new HashSet<>();

        for (Integer i = 1; i <= 198 ; i++) {
            if (i < 10)
            {
                regions.add("0" + i.toString());
            }
            else {
                regions.add(i.toString());
            }
        }

        for (int i = 1; i <= 999 ; i++) {
            if (i % 111 == 0) {
                numbers.add(i);
            }
        }
        numbers.add(799);
        numbers.add(759);
        numbers.add(777);

        for (int k = 0; k < regions.size() ; k++) {
            for (int i = 0; i < numbers.size(); i++) {
                for (int j = 0; j < letters.length; j++) {
                    coolNumber.add(letters[j].replaceAll(" ", numbers.get(i).toString() + regions.get(k)));

                }

            }
        }




        System.out.println(coolNumber.size());
    }
}