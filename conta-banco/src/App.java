import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*TODO:
        Conhecer e importar a classe Scanner
        Exibir as mensagens para o nosso usuário
        Obter pela scanner os valores digitados no terminal
        Exibir a mensagem conta criada
        */
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem-vindo(a) ao QuinBanco. Cria sua conta!");
        System.out.println("Por favor, digite o seu nome:");
        String nome = sc.next();
        System.out.println("Por favor, digite o seu sobrenome:");
        String sobrenome = sc.next();
        System.out.println("Agora digite o número da Agência:");
        String agencia = sc.next();
        System.out.println("Agora insira o número da sua conta:");
        int numero = sc.nextInt();
        System.out.println("Insira o valor do seu saldo, lembrando que os últimos dois dígitos são os centavos");
        double saldo = sc.nextDouble();

        String nomeCliente = nome.concat(" " + sobrenome);

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,\n");
        System.out.print("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + dinheiro.format(saldo) + " já está disponível para saque.");
        sc.close();
    }
}
