import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        System.out.println("");

        ChineseZodiac chineseZodiac = new ChineseZodiac(birthYear);
        System.out.println("Your Chinese zodiac sign: " + chineseZodiac.calculateZodiacSign());
    }


}