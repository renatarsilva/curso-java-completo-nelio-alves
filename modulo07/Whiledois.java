package modulo07;
import java.util.Scanner;
public class Whiledois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int x = sc.nextInt();



        while(x != 79){
            System.out.println("Digite outro valor");
            x = sc.nextInt();
        }
        System.out.println("Você acertou!!");
        sc.close();
    }
}
