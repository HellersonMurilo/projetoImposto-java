package Class;

public class Empresa extends Contribuinte {
    //atributos
    private int numeroFuncionarios;
    
    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Empresa(String nomeContribuinte, Double rendaAnual, int numeroFuncionarios) {
        super(nomeContribuinte, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
        
    }

    @Override
    public void imposto() {
        if(getNumeroFuncionarios() > 10){
            double impostoFuncionario = getRendaAnual() * 0.14;
            System.out.println("Valor do imposto para pessoa Juridica R$ " + impostoFuncionario);
        }else{
            double impostoFuncionario = getRendaAnual() * 0.16;
            System.out.println("Valor do imposto para pessoa Juridica R$ " + impostoFuncionario);
        }
    }


}
