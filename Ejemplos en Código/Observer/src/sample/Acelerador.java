package sample;

public class Acelerador implements ObjetoObservado
{

    public Observador MyMotor;
    /*Construction method
     *@author: Adrian González
     *@Version 16/03/2020
     */

    public  Acelerador(){

    }

    /*Calls antoher method
     *@author: Adrian González
     *@Version 16/03/2020
     *@param nothing
     */
    public void pisarAcelerador(){
    notificar();
    }


    /*Calls antoher method
     *@author: Adrian González
     *@Version 16/03/2020
     *@param nothing
     */
    public void enlazarObservador(Observador o){
        MyMotor= o;

    }


    @Override
    public void notificar() {
        MyMotor.update();
    }
}
