import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int numConta;
    private double saldo;
    private String tConta;
    public Pessoa(String nome, int numConta, double saldo ) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;

    }
    public Pessoa(String nome, int numConta, double saldo, String tConta) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
        this.tConta = tConta;
    }
    public Pessoa() {
    }

    public String gettConta() {
        return tConta;
    }

    public void settConta(String tConta) {
        this.tConta = tConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double sacar(double val){
        if(val > saldo){
            System.out.println("Seu saldo é insuficiente");
        }else if(negativo(val)){
        } else{
            double saldoAtual = saldo -= val;
           saldo = saldoAtual;
            System.out.println("Seu saldo é: " + saldo);
        }
        return saldo;
    }
    public double depositar(double val){
        if (negativo(val)) {
            return saldo;
        }else {
            return saldo += val;
        }
    }
    public double transferir(double val){
        if(val > saldo){
            System.out.println("Seu saldo é insuficiente");
        } else if(negativo(val)){
        } else{
            double saldoAtual = saldo -= val;
            saldo = saldoAtual;
            System.out.println("A quantidade transferida é de " + val + " e seu saldo da conta é " + saldo);
        }
        return saldo;
        }

    public double mostrarSaldo(){
        return getSaldo();
    }
    public double investir(double val) {
        if (val > saldo) {
            System.out.println("Seu saldo é insuficiente");
        } else if(negativo(val)){
        } else {
            double saldoAtual = saldo -= val;
            saldo = saldoAtual;
            System.out.println("a quntidade investida é " + val + " e seu saldo é de " + saldo);
        }
        return saldo;
    }
    public double contaPoupanca(double val){
            if (val > saldo) {
                System.out.println("Seu saldo é insuficiente");
            } else if(negativo(val)){
            } else {
                double saldoAtual = saldo -= val;
                saldo = saldoAtual;
                System.out.println("a quntidade investida é" + val + "e seu saldo é de " + saldo);
            }
            return saldo;
        }

    public boolean negativo(double val){
             if(val<=0){
                 System.out.println("Ação negada!");
                 return true;
             } else {
                 return false;
             }
    }

}
