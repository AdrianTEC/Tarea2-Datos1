package sample;



public class Main {

    public static void main(String[] args) {
        Motor motorcito = new Motor();
        Acelerador aceleradorcito= new Acelerador();

        aceleradorcito.enlazarObservador(motorcito);

        aceleradorcito.pisarAcelerador();








    }
}
