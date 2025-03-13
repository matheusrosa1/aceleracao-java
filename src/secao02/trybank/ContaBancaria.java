package secao02.trybank;

public class ContaBancaria {
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = 0;
    }

    void mostraMensagem() {
        System.out.println("Conta bancária acessada.");
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    double converteMoeda(float total, float cambio) {
        return total * cambio;
    }
}
