import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         //Exibir as mensagens para o nosso usuario 
        System.out.println("Por favor, digite o número da Agência !");
        Double agência = scanner.nextDouble();

        System.out.println("Infome o numero da conta !");
        int conta = scanner.nextInt();

        System.out.println("Informe seu nome");
        String nome = scanner.next();

        System.out.println("Informe seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Informe o saldo");
        Double saldo = scanner.nextDouble();

        //Obter pela scanner os valres digitados 
      
        //Olá [Nome Cliente], obrigado por criar uma conta em nosso banco,
        // sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] 
        //já está disponível para saque".
        //Exibir a mensagem conta criada
        System.out.println("Olá" + " " + nome + " " + sobrenome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é" + " " + agência + ", " + "sua conta" + " " + conta + " " + "e seu saldo " + saldo + " já está disponível para saque");
 
    }
}
