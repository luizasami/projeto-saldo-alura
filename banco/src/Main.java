import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoDaConta = 3000;

        System.out.println("Tela inicial do cliente!\n************************");
        System.out.println("Nome: Elle Robin");
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo: R$"+saldoDaConta+"\n************************");

        System.out.println("Operações");
        System.out.println("""
                1. Consultar Saldo
                2. Receber Valor
                3. Transferir valor
                4. Sair
                """);
        System.out.println("Digite a opção desejada: ");
        double opcao = sc.nextInt();

        if (opcao == 1){
            System.out.println("O saldo é R$"+saldoDaConta);
        } else if (opcao == 2){
            System.out.println("Digite o valor pra receber: ");
            double valorReceber = sc.nextInt();
            double valorFinal = valorReceber + saldoDaConta;
            System.out.println("O saldo atual é R$"+valorFinal);
        } else if (opcao == 3) {
            System.out.println("Digite o valor para transferir: ");
            double valorTrans = sc.nextInt();
            if (valorTrans > saldoDaConta) {
                System.out.println("Não há saldo para realizar a transferência.");
            } else {
                saldoDaConta -= valorTrans;
                System.out.println("Novo saldo: " + saldoDaConta);
            }
        } else if (opcao == 4){
            System.out.println("Operação finalizada.");
        } else {
            System.out.println("Erro no sistema! Tente novamente!");
        }


    }
}