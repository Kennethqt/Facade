import static javafx.application.Application.launch;

public class Main{
    public static void main(String[] args){
        Facade cajero_automatico = new Facade();

        cajero_automatico.introducirCredenciales();
        cajero_automatico.sacarDinero();
        launch(args);
    }

}
