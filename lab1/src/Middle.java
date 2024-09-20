import java.util.Scanner;
public class Middle {
    private String str = "";
    private int middle;
    public Middle(){}
    public void middle()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        str = scanner.nextLine();

        if (str.length() % 2 == 0) {
            middle = str.length() / 2;

            System.out.println("Два символа в середине: " + str.substring(middle - 1, middle + 1));
        } else {
            System.out.println("Длина строки нечётная, невозможно вывести два символа.");
        }

        scanner.close();

    }
}