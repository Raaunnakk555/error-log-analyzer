import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ErrorAnalyzer analyzer = new ErrorAnalyzer("data/errors.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Error Log Analyzer ===");

        while (true) {
            System.out.print("\nEnter error (or type 'exit'): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            String result = analyzer.analyzeError(input);
            System.out.println(result);
        }

        scanner.close();
    }
}
