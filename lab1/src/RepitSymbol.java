import java.util.HashSet;
import java.util.Scanner;
public class RepitSymbol {

    public void problem3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        String minWord = null;
        int minUniqueChars = Integer.MAX_VALUE;

        for (String word : words) {

            HashSet<Character> uniqueChars = new HashSet<>();

            for (char ch : word.toCharArray()) {
                uniqueChars.add(ch);
            }

            if (uniqueChars.size() < minUniqueChars) {
                minUniqueChars = uniqueChars.size();
                minWord = word;
            }
        }

        if (minWord != null) {
            System.out.println("Слово с минимальным числом различных символов: " + minWord);
        }

        scanner.close();
    }
}

