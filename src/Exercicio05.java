import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        for(int i=0; i< nomes.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println((i+1)+"º nome:");
            nomes[i] = scanner.nextLine();
        }
        for(int i=0; i< nomes.length; i++){
            System.out.println((i+1)+"-"+nomes[i]);
        }
    }
}
