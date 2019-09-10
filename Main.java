import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] letters = {"А АА", "В ВВ", "Е ЕЕ", "К КК", "М ММ", "Н НН", "О ОО", "Р РР", "С СС", "Т ТТ", "У УУ", "Х ХХ"};
        ArrayList<String> coolNumbers = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            for (Integer region = 1; region <= 199; region++) {
                for (Integer number = 1; number < 1000; number++) {
                    if (number % 111 == 0 || number % 2 == 0) {
                        if (region < 10) {
                            coolNumbers.add((letters[i].replaceAll(" ", number.toString())).concat("0".concat(region.toString())));
                        } else {
                            coolNumbers.add((letters[i].replaceAll(" ", number.toString())).concat(region.toString()));
                        }
                    }
                }
            }

        }
        while (true) {
            System.out.println("Введите номер для поиска: ");
            Scanner scanner = new Scanner(System.in);
            String inputNumber = scanner.nextLine();
            if (!inputNumber.matches("[А-Я]\\d{3}[А-Я]{2}\\d{2,3}")) {
                System.out.println("Такого номера не существует!");
                continue;
            }
            searchInAll(coolNumbers, inputNumber);
            binarySeatch(coolNumbers, inputNumber);
            hashSetSearch(coolNumbers, inputNumber);
            treeSetSearch(coolNumbers, inputNumber);
        }
    }

    public static void searchInAll(ArrayList<String> list, String value) {
        long start = System.currentTimeMillis();
        System.out.println(list.contains(value) ? "Время поиска перебором: " + (System.currentTimeMillis() - start) + "ms": "Номер не блатной!");
    }

    public static void binarySeatch(ArrayList<String> list, String value) {
        long start = System.currentTimeMillis();
        System.out.println(list.contains(value) ? "Время бинарного поиска: " + (System.currentTimeMillis() - start) + "ms" : "Номер не блатной!");
    }
    public static void hashSetSearch(ArrayList<String> list, String value)
    {
        HashSet<String> temp = new HashSet<>();
        temp.addAll(list);
        long start = System.currentTimeMillis();
        System.out.println(temp.contains(value) ? "Время HashSet поиска: " + (System.currentTimeMillis() - start) + "ms" : "Номер не блатной!");
    }
    public static void treeSetSearch(ArrayList<String> list, String value)
    {
        TreeSet<String> temp = new TreeSet<>();
        temp.addAll(list);
        long start = System.currentTimeMillis();
        System.out.println(temp.contains(value) ? "Время TreeSet поиска: " + (System.currentTimeMillis() - start) + "ms" : "Номер не блатной!");
    }

}
