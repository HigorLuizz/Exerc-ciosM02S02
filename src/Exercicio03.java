import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String perg = "sim";
        System.out.println("Escreva algo:");
        String s = in.nextLine();
        while(perg != "fim"){
            System.out.println("Digite um número: ");
            int a = in.nextInt();
            System.out.println("Digite outro número: ");
            int b = in.nextInt();
            System.out.println("O que você quer fazer com os números? digite\n1-somar" +
                    "\n2-subtrair" +
                    "\n3-multiplicar" +
                    "\n4-dividir");
            int c = in.nextInt();
            if(c == 1){
                int result = a+b;
                System.out.println("o resultado é "+result);
            } else if(c == 2){
                int result = a-b;
                System.out.println("o resultado é "+result);
            } else if (c == 3) {
                int result = a*b;
                System.out.println("o resultado é "+result);
            }else if(c == 4) {
                float result = a/b;
                System.out.println("o resultado é "+result);
            };
            System.out.println("Quer continuar calculando?\n" +
                    "Escreva: " +
                    "\nSim para continuar" +
                    "\nfim para parar");
            System.out.println(perg);
            perg = in.nextLine();
        }
    }
}
