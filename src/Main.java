import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.println("Введите букву:");
        String letter = scanner.next();

        Pattern pattern = Pattern.compile("\\p{IsCyrillic}+");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            String word = matcher.group();
            if (word.toLowerCase().startsWith(letter))
                System.out.println(word);
        }
    }
}
