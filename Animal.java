public class Animal {

    private String nome;
    private String alimentacao;
    private String reproducao;
    private String locomocao;
    private Integer tamanho;
    private Integer peso;

    public Animal(String nome, String alimentacao, String reproducao, String locomocao, Integer tamanho, Integer peso) {
        this.nome = nome;
        this.alimentacao = alimentacao;
        this.reproducao = reproducao;
        this.locomocao = locomocao;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public String getReproducao() {
        return reproducao;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public Integer getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Animal "+ nome ;
    }

    
}
