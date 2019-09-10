import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String[] letters = {"А АА", "В ВВ","Е ЕЕ","К КК","М ММ","Н НН","О ОО","Р РР","С СС","Т ТТ","У УУ","Х ХХ"};
        ArrayList<String> collNumbers = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < letters.length ; i++) {
            for (Integer region = 0; region < 199 ; region++) {
                for (Integer number = 1; number < 1000 ; number++) {
                   if (number % 111 == 0)
                   {
                       if (region < 10)
                       {
                           collNumbers.add((letters[i].replaceAll(" ", number.toString())).concat("0".concat(region.toString())));
                       } else {
                           collNumbers.add((letters[i].replaceAll(" ", number.toString())).concat(region.toString()));
                       }
                   }
                }
            }

        }

    }
}