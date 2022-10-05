import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = in.nextInt();
        System.out.println("Digite outro número: ");
        int b = in.nextInt();
        System.out.println("O resultado de "+a+" + "+b+" é igual a "+(a+b));
    }
}