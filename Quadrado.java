public class Quadrado {
    public static void main(String[] args) {
        int numero = 0;

        while (numero * numero < 100) {
            int quadrado = numero * numero;
            System.out.println("Quadrado de " + numero + " = " + quadrado);
            numero++;
        }

        System.out.println("Fim!");
    }
}