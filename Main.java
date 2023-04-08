import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal coelho = new Animal("coelho","herbivoro","sexuada","terrestre",30,5);
        Animal bemTeVi = new Animal("bemTeVi","herbivoro","sexuada","aereo",15,1);
        Animal vaca = new Animal("vaca","herbivoro","sexuada","terrestre",300,1000);
        Animal cobra = new Animal("cobra","oviparo","assexuada","terrestre",100,6);
        Animal leao = new Animal("leao","carnivoro","sexuada","terrestre",200,100);

        List<Animal> listaDeAnimais = Arrays.asList(coelho,bemTeVi,vaca,cobra,leao);
        
        System.out.println("stream1");
        listaDeAnimais.stream().
            filter(a->a.getAlimentacao()=="herbivoro" && a.getPeso()<50).
            forEach(System.out::println);
        
        System.out.println("stream2");
        listaDeAnimais.stream().
            filter(a->a.getReproducao()=="sexuada" && a.getLocomocao()=="aereo").
            forEach(System.out::println);
        
        System.out.println("stream3");
        listaDeAnimais.stream().
            filter(a->a.getTamanho()>=10 && a.getPeso()<50).
            forEach(System.out::println);
        
        System.out.println("stream4");
        listaDeAnimais.stream().
            filter(a->a.getReproducao()=="sexuada" && a.getPeso()>=100).
            forEach(System.out::println);
    }
}