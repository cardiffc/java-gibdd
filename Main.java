import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] letters = {"A AA", "B BB"};
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 999 ; i++) {
            if (i % 111 == 0) {
                numbers.add(i);

            }
        }

        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));

        }



    }
}