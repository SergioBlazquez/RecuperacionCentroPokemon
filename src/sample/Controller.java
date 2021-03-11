package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;




import java.io.IOException;

public class Controller {

    Pokemon pokemon= new Pokemon();


   // @FXML
    //ImageView img1;

    @FXML
     ProgressBar proBar1;

    @FXML
    ProgressBar proBar2;

    @FXML
    ProgressBar proBar3;

    @FXML
    ProgressBar proBar4;

    @FXML
    ProgressBar proBar5;

    @FXML
    ProgressBar proBar6;

    @FXML
    Label txt1;

    @FXML
    Label txt2;

    @FXML
    Label txt3;

    @FXML
    Label txt4;

    @FXML
    Label txt5;

    @FXML
    Label txt6;

    @FXML
    Button but1;


    @FXML
    public void onClickBar1(){  //(MouseEvent mouseEvent)

        txt1.setStyle("-fx-background-color: #4FDA00");

        pokemon.setNombre("Infernape");
        pokemon.setVida(105);

    }

    @FXML
    public void onClickBar2(){

        txt2.setStyle("-fx-background-color: #4FDA00");

        pokemon.setNombre("Luxray");
        pokemon.setVida(92);

    }

    @FXML
    public void onClickBar3(){

        txt3.setStyle("-fx-background-color: #4FDA00");

        pokemon.setNombre("Garchomp");
        pokemon.setVida(126);

    }

    @FXML
    public void onClickBar4(){

        txt4.setStyle("-fx-background-color: #4FDA00");

        pokemon.setNombre("Starraptor");
        pokemon.setVida(98);

    }

    @FXML
    public void onClickBar5(){

        txt5.setStyle("-fx-background-color: #4FDA00");

        pokemon.setNombre("Zoroark");
        pokemon.setVida(82);

    }

    @FXML
    public void onClickBar6(){

        txt6.setStyle("-fx-background-color: #4FDA00");
        pokemon.setNombre("Tyranitar");
        pokemon.setVida(162);

    }
    @FXML
    public void onClickBut1() throws  IOException{



           /* Parent root = FXMLLoader.load(getClass().getResource("mochila.fxml"));
            Stage primaryStage = new Stage();
            Scene scene = new Scene(root, 300, 275);
            primaryStage.setTitle("Botiquín");
            primaryStage.setScene(scene);
            primaryStage.show();*/

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("mochila.fxml"));
            Parent parent = loader.load();

            Scene scene = new Scene(parent);

            Mochila mochila = loader.getController();
            mochila.pokemonMochila(pokemon);//tableView.getSelectionModel().getSelectedItem()
           //mochila.label.setText(pokemon.getNombre()+" tiene actualmente "+pokemon.getVida()+" puntos de vida");


        if(mochila.fullVida()){


            switch (pokemon.getNombre()) {
                case "Infernape":
                    proBar1.setProgress(1);
                    break;
                case "Luxray":
                    proBar2.setProgress(1);
                    break;
                case "Garchomp":
                    proBar3.setProgress(1);
                    break;
                case "Starraptor":
                    proBar4.setProgress(1);
                    break;
                case "Zoroark":
                    proBar5.setProgress(1);
                    break;
                case "Tyranitar":
                    proBar6.setProgress(1);
                    break;
            }
        }

    }





}
