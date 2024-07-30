import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //criando o Banco...
        Banco bancoOO = new Banco();
        bancoOO.setNome("BANCO ORIENTADO A OBJETOS");

        //Criando dois clientes...
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Yuri Jivago");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Simone Xavier");

        //Criando as contas
        ContaCorrente conta1 = new ContaCorrente(cliente1);
        ContaPoupanca conta2 = new ContaPoupanca(cliente2);

        //Adicionando as contas ao Banco
        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);

        bancoOO.setContas(contas);

        //Manipulando a conta
        conta1.imprimirExtrato();
        conta1.depositar(100);
        conta1.imprimirExtrato();

        conta2.imprimirExtrato();
        conta2.depositar(200);
        conta2.imprimirExtrato();
        conta2.renderPoupanca();
        conta2.imprimirExtrato();

    }
}
