import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Class.Empresa;
import Class.Individual;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Individual individual = new Individual("Joao", null, null);
        Empresa empresa = new Empresa("Teste", null, 0);

        System.out.println("Informe o numero de pagadores");
        int numPagador = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= numPagador; i++) {
            System.out.println("Qual o Tipo de pessoa (F/j)?");
            char tipoEmpresa = sc.next().charAt(0);
            if (tipoEmpresa == 'F' || tipoEmpresa == 'f') {
                System.out.println("informe o seu nome");
                individual.setNomeContribuinte(sc.next());
                System.out.println("Informe a sua renda anual");
                individual.setRendaAnual(sc.nextDouble());
                System.out.println("Gasto com despesas médicas");
                individual.setDespesasSaude(sc.nextDouble());
                individual.imposto();
            }else{
                System.out.println("informe o nome da empresa");
                empresa.setNomeContribuinte(sc.next());
                System.out.println("Informe a quantidade de funcionarios");
                empresa.setNumeroFuncionarios(sc.nextShort(0));
                System.out.println("Informe a renda anual");
                empresa.setRendaAnual(sc.nextDouble());
                empresa.imposto();
            }
        }


    }
}
