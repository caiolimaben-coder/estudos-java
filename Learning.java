import java.util.ArrayList;

public class Learning {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Naruto");
        nomes.add("Sasuke");
        nomes.add("Sakura");

        for (int i = 0; i < nomes.size(); i++){
        System.out.println(nomes.get(i));
        }
        for (String nome :  nomes){
            System.out.println(nome);
        }

        int contador = 1;
        while(contador < 10){
        System.out.println("Estou no while");
        contador++;}
    }
}
