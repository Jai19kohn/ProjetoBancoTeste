public class Pf extends Pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pf(String nome, int numConta, double saldo,String tConta, String cpf) {
        super(nome, numConta, saldo, tConta);

    }
    public Pf(String nome, int numConta, double saldo, String cpf) {
        super(nome, numConta, saldo);

    }
    public Pf() {}

    @Override
    public double sacar(double val) {
        if (val>5001){
            System.out.println("Você não pode sacar mais que 5000!");
        }
        return super.sacar(val);
    }
}

