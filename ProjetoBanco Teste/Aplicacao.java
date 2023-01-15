import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        String cren; //Criar e entrar
        String tipo;

        Funcoes funcoes = new Funcoes();
        Pf pfCriar = new Pf(funcoes.getNome(), 9999, 0, funcoes.getCpf());
        Pf pfEntrar = new Pf("Rosangela", 1234, 35240, "09072832457");
        Pj pjCriar = new Pj(funcoes.getNome(), 1111, 0, funcoes.getCnpj());
        Pj pjEntrar = new Pj("Lojita", 4321, 3563565, "13624635789");

        try {
            do {
                System.out.println("Digite 'PF' se você é Pessoa fisica e 'PJ' se você é Pessoa juridica:");
                tipo = ler.next();
            } while (!tipo.equalsIgnoreCase("pf") && !tipo.equalsIgnoreCase("pj"));
            if ("PF".equalsIgnoreCase(tipo)) {
                cren = funcoes.Cren();
                //Pf pf = null;
                if ("CRIAR".equalsIgnoreCase(cren)) {
                    funcoes.criarContPf();
                    System.out.println("O número da sua conta é " + pfCriar.getNumConta());
                    System.out.println("Bem vindo a sua conta!");
                    try {
                        do {
                            num = funcoes.numAcao();
                            funcoes.acao(pfCriar, num);
                        } while (num != 7);
                    } catch (InputMismatchException exception) {
                        System.out.println("Você digitou algo que não foi um número!");
                    }
                } else if ("ENTRAR".equalsIgnoreCase(cren)) {
                    funcoes.entrarContPf();
                    try {
                        do {
                            num = funcoes.numAcao();
                            funcoes.acao(pfEntrar, num);
                            System.out.println("Bem vindo a sua conta!");
                        } while (num != 7);
                    } catch (InputMismatchException exception) {
                        System.out.println("Você digitou algo que não foi um número!");
                    }
                }
            } else if ("PJ".equalsIgnoreCase(tipo)) {
                cren = funcoes.Cren();
                if ("CRIAR".equalsIgnoreCase(cren)) {
                    funcoes.criarContPj();
                    System.out.println("O número da conta é " + pjCriar.getNumConta());
                    try {
                        do {
                            num = funcoes.numAcao();
                            funcoes.acao(pjCriar, num);
                        } while (num != 7);
                    } catch (InputMismatchException exception) {
                        System.out.println("Você digitou algo que não foi um número!");
                    }
                } else if ("ENTRAR".equalsIgnoreCase(cren)) {
                    funcoes.entrarContPj();
                    System.out.println("Bem vindo a sua conta!");
                    try {
                        do {
                            num = funcoes.numAcao();
                            funcoes.acao(pjEntrar, num);
                        } while (num != 7);
                    } catch (InputMismatchException exception) {
                        System.out.println("Você digitou algo que não foi um número!");
                    }
                }
            }}catch(InputMismatchException exception){
                System.out.println("Erro inesperado!");
            }
    }
}