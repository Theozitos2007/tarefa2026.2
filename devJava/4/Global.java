//classe para variaveis globais
public class Global {


    // controle de saldo independente das classes de pagamento
    private double saldo = 600;

    // limite de credito
    private double credLimit = 600;

    // senha de login
    private int senhaLogin;

    // senha de transacao
    private int senhaTransacao;

    ///////////////// getters e setters
    public double getCredLimit() {
        return credLimit;
    }

    public void setCredLimit(double credLimit) {
        this.credLimit = credLimit;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSenhaLogin(int senhaLogin) {
        this.senhaLogin = senhaLogin;
    }

    public void setSenhaTransacao(int senhaTransacao) {
        this.senhaTransacao = senhaTransacao;
    }
////////////////////// getters e setters


    // verificar senha sem a expor externamente

    public boolean validatePass(int newPass){
        return newPass == senhaTransacao;
    }


}
