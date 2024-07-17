import java.util.Scanner;
import exceptions.InvalidParametersException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int first = scanner.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int second = scanner.nextInt();

        try {
            count(first, second);
        } catch (InvalidParametersException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        scanner.close();
    }

    static void count(int first, int second) throws InvalidParametersException {
        if (first > second)
            throw new InvalidParametersException();

        int counter = second - first;

        for (int i = 1; i <= counter; i++)
            System.out.println("Imprimindo o número " + i);
    }
}
