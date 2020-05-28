package sample;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
//se ve herencia por medio del extends
public class Carro extends Application {

        //Se puede ver abstracción por la simplificación del sistema del auto
        //Se ven atributos
        //Se ve encapsulación
        private Motor motorcito;
        private  Acelerador aceleradorcito;
//CODIGO INSPIRADO EN https://www.youtube.com/watch?v=Zt6478Za0zk

    public Carro()
        {
            motorcito = new Motor();
            aceleradorcito= new Acelerador();

        }

    @Override
    //EJEMPLO DE OVERWRITING
    public void start(Stage stage) throws Exception {



        ///COSAS GRAFICAS

        aceleradorcito.enlazarObservador(motorcito);
        //aqui hay instanciación
        Pane root = new Pane();
        Label texto = new Label();
        motorcito.texto= texto;

        texto.setLayoutX(50);
        texto.setLayoutY(40);
        texto.setPrefSize(200,100);
        texto.setStyle("-fx-background-color: #4c4ea1");
        Button acelerador = new Button();
        acelerador.setLayoutX(100);
        acelerador.setLayoutY(150);
        acelerador.setPrefSize(100,10);
        acelerador.setOnMouseClicked (new EventHandler<MouseEvent>()
                               {

                                   @Override
                                   public void handle(MouseEvent mouseEvent) {

                                            aceleradorcito.notificar();
                                   }


                               });






        stage.setResizable(false);
        root.setStyle("-fx-background-color: #191b54");
        stage.setScene(new Scene(root, 300, 300));
        root.getChildren().addAll(acelerador,texto);
        stage.show();
        //aceleradorcito.pisarAcelerador();
    }
}
