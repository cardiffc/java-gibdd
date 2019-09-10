import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String[] letters = {"А АА", "В ВВ","Е ЕЕ","К КК","М ММ","Н НН","О ОО","Р РР","С СС","Т ТТ","У УУ","Х ХХ"};
        ArrayList<String> regions = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        TreeSet<String> coolNumber = new TreeSet<>();

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
        regions.add("799");
        regions.add("759");
        regions.add("777");

        for (int k = 0; k < regions.size() ; k++) {
            for (int i = 0; i < numbers.size(); i++) {
                for (int j = 0; j < letters.length; j++) {
                    coolNumber.add((letters[j].replaceAll(" ", numbers.get(i).toString()).concat(regions.get(k))));

                }

            }
        }


        for (var number : coolNumber)
        {
            System.out.println(number);
        }
        System.out.println(coolNumber.size());
    }
}