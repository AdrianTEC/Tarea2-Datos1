package sample;

public class Motor implements Observador {

    public Motor(){



    }
    @Override
    public void update() {
        System.out.println("Acelerando");
    }


}
