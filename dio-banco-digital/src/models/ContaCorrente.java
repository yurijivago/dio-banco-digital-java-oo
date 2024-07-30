package models;

public class ContaCorrente extends Conta{
    private static final double TAXA_EXTRATO = 0.05;
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        this.saldo -= TAXA_EXTRATO;
        super.imprimirInfosComuns();
    }

    @Override
    public void imprimirInfosComuns(){
        this.saldo -= TAXA_EXTRATO;
        super.imprimirInfosComuns();
    }
}
