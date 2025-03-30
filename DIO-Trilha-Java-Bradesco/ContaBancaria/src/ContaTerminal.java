import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero de sua agencia: ");
        String numeroAgencia = input.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numeroConta = input.nextInt();

        System.out.println("Digite o seu nome: ");
        input.nextLine();
        String cliente = input.nextLine();

        System.out.println("Digite o saldo: ");
        BigDecimal saldo = input.nextBigDecimal();

        System.out.println("Olá" + cliente + "obrigado por criar uma conta em nosso banco," +
         "sua agência é" + numeroAgencia + ", conta " + numeroConta + "e seu saldo " + saldo + 
         " já está disponível para saque");
    }
}