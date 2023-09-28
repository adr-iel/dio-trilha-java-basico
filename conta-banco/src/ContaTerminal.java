import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o número da Agência: ");
        agencia = scanner.nextLine();
        
        System.out.println("Agora digite o número da sua conta: ");
        numero = scanner.nextInt();
        
        System.out.println("Por fim, informe seu saldo: ");
        saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
        
        scanner.close();
	}

}
