import java.util.Scanner;
public class Latin {
    public void latin(){
        Scanner scanner = new Scanner(System.in);

        // Ввод строки
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Разделяем строку на слова
        String[] words = input.split("\\s+");

        System.out.println("Слова, состоящие только из латинских букв:");
        for (String word : words) {
            // Проверяем, состоит ли слово только из латинских букв
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
