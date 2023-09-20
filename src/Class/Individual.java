package Class;

import java.util.Scanner;

public class Individual extends Contribuinte {

    // atributos
    private Double despesasSaude;

    // get e set
    public Double getDespesasSaude() {
        return despesasSaude;
    }

    public void setDespesasSaude(Double despesasSaude) {
        this.despesasSaude = despesasSaude;
    }

    // metodo contrutor
    public Individual(String nome, Double despesasSaude, Double rendaAnual) {
        super(nome, rendaAnual);
        this.despesasSaude = despesasSaude;
    }

    // metodos
    @Override
    public void imposto() {
        if (getRendaAnual() < 20000) {
            Scanner sc = new Scanner(System.in);
            Double impostoIndividual = getRendaAnual() * 0.15;
            char despesaSaude;

            System.out.println("Teve gasto com despesas em saúde? (S/n)");
            despesaSaude = sc.next().charAt(0);

            if (despesaSaude == 'S' || despesaSaude == 's') {
                Double valorDespesaSaude = getDespesasSaude() * 0.5;
                impostoIndividual -= valorDespesaSaude;
                System.out.println("Imposto a ser cobrado considerando os gastos com saúde R$ " + impostoIndividual);
            } else {
                System.out.println("Imposto a ser cobrado R$ " + impostoIndividual);
            }

        } else {
            Scanner sc = new Scanner(System.in);
            Double impostoIndividual = getRendaAnual() * 0.25;
            char despesaSaude;

            System.out.println("Teve gasto com despesas em saúde? (S/n)");
            despesaSaude = sc.next().charAt(0);

            if (despesaSaude == 'S' || despesaSaude == 's') {
                Double valorDespesaSaude = getDespesasSaude() * 0.5;
                impostoIndividual -= valorDespesaSaude;
                System.out.println("Imposto a ser cobrado considerando os gastos com saúde R$ " + impostoIndividual);
            } else {
                System.out.println("Imposto a ser cobrado R$ " + impostoIndividual);
            }
        }
    }
}
