import Estrutura.Conta.Conta;
import Estrutura.Conta.ContaCorrente;
import Estrutura.Conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

    Conta conta = new ContaCorrente();
    conta.depositar(100);
    conta.sacar(50);

    Conta poupanca = new ContaPoupanca();
    conta.transferir(50, poupanca);

        conta.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}