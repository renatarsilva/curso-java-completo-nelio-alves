import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();

        System.out.println(nome);

        double x = 10.35784;

        System.out.printf("%.2f \n", x);

        // inverter , para .
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f", x);


    }
}
