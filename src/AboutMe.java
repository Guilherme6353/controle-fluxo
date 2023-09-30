import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try{
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olé me chamo: " + nome.toUpperCase()+ " " + sobreNome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é: " + altura + "cm ");
        scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos...");
        }

        
    }
    
}
