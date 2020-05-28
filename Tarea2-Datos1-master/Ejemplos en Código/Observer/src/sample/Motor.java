package sample;

import java.awt.*;

public class Motor implements Observador {
    public javafx.scene.control.Label texto;


    public Motor(){


    }
    @Override
    public void update() {

        texto.setText("el motor está encendido");

    }


}
