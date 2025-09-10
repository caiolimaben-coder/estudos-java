public class Casting {
    public static void main(String[] args) {
        double resultado = 0.0;
        int resultadoInt = (int) resultado; // casting explicito

        int meuInt = 10;
        double meuDouble = meuInt; // casting implicito

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString); // transformar string em inteiro

        String minhaString = String.valueOf(meuInt2); // transformar inteiro em string



    }
}
