package Class;

public abstract class Contribuinte {
    //Atibutos
    private String nomeContribuinte;
    private Double rendaAnual;

    //metodos getters e setters
    public String getNomeContribuinte() {
        return nomeContribuinte;
    }

    public void setNomeContribuinte(String nomeContribuinte) {
        this.nomeContribuinte = nomeContribuinte;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    //metodo construtor
    public Contribuinte(String nomeContribuinte, Double rendaAnual){
        this.nomeContribuinte = nomeContribuinte;
        this.rendaAnual= rendaAnual;
    }

    //metodo abstrato obrigatório
     public abstract void imposto();
}