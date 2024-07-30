package models;

public class ContaPoupanca extends Conta{
    private static final double TAXA_RENDIMENTO_POPUPANCA = 0.10;
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    public void renderPoupanca(){
        this.saldo = this.saldo * (1 + TAXA_RENDIMENTO_POPUPANCA);
    }
}
