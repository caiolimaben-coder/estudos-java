public class Classes {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(  "Fusca");
        Carro meuCarro1 = new Carro( "BMW");
        Carro meuCarro2 = new Carro( "Jaguar");

        meuCarro1.acelerar();
        meuCarro2.acelerar();
        meuCarro.acelerar();


    }



    }

    class Carro {

        String modelo;

        public Carro(String modelo){
           this.modelo = modelo;
        }

        public void acelerar() {


            System.out.println("Acelerando o carro" + this.modelo);
            System.out.println("Acelerando o carro" + this.modelo);
            System.out.println("Acelerando o carro" + this.modelo);


        }
    }







