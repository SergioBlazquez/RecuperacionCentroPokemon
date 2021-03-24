package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


import java.awt.*;
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
    ImageView fav1;

    @FXML
    ImageView fav2;

    @FXML
    ImageView fav3;

    @FXML
    ImageView fav4;

    @FXML
    ImageView fav5;

    @FXML
    ImageView fav6;


    @FXML
    public void onClickBar1(){  //(MouseEvent mouseEvent)

        txt1.setStyle("-fx-background-color: #4FDA00");

        pokemon.setNombre("Infernape");
        pokemon.setVida(105);
        pokemon.setSexo(true);
        pokemon.setDetalles("Su corona de fuego demuestra su naturaleza ígnea. Nadie le gana en velocidad.");

    }

    @FXML
    public void onClickBar2(){

        txt2.setStyle("-fx-background-color: #4FDA00");

        pokemon.setNombre("Luxray");
        pokemon.setVida(92);
        pokemon.setSexo(true);
        pokemon.setDetalles("Tiene la capacidad de ver a través de cualquier cosa. Encuentra enseguida su presa, aunque se oculte tras una pared de gran grosor.");

    }

    @FXML
    public void onClickBar3(){

        txt3.setStyle("-fx-background-color: #4FDA00");

        pokemon.setNombre("Garchomp");
        pokemon.setVida(126);
        pokemon.setSexo(false);
        pokemon.setDetalles("Se mueve a gran velocidad incluso por tierra. Es capaz de cazar una presa en una montaña nevada y volver a su guarida sin llegar a pasar frío.");

    }

    @FXML
    public void onClickBar4(){

        txt4.setStyle("-fx-background-color: #4FDA00");

        pokemon.setNombre("Starraptor");
        pokemon.setVida(98);
        pokemon.setSexo(false);
        pokemon.setDetalles("Al evolucionar a Starraptor deja su bandada y pasa a vivir en soledad. Sus alas son inmensas.");

    }

    @FXML
    public void onClickBar5(){

        txt5.setStyle("-fx-background-color: #4FDA00");

        pokemon.setNombre("Zoroark");
        pokemon.setVida(82);
        pokemon.setSexo(true);
        pokemon.setDetalles("Cuida de sus semejantes. Provoca ilusiones terroríficas para proteger tanto su guarida como a su manada de sus adversarios.");

    }

    @FXML
    public void onClickBar6(){

        txt6.setStyle("-fx-background-color: #4FDA00");
        pokemon.setNombre("Tyranitar");
        pokemon.setVida(162);
        pokemon.setSexo(true);
        pokemon.setDetalles("Sus estrepitosos pasos derrumban montañas y hacen que el terreno a su alrededor cambie drásticamente.");

    }
    //@FXML
    public void onClickBut1() throws  IOException{
/*


            Parent root = FXMLLoader.load(getClass().getResource("mochila.fxml"));
            Stage primaryStage = new Stage();
            Scene scene = new Scene(root, 300, 275);
            primaryStage.setTitle("Botiquín");
            primaryStage.setScene(scene);
            primaryStage.show();
*/



            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("mochila.fxml"));
            Parent parent = loader.load();
            Stage primaryStage = new Stage();
            Scene scene = new Scene(parent);

            primaryStage.setTitle("Botiquín");
            primaryStage.setScene(scene);
            primaryStage.show();

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

    public void esFavorito(){

        //No me da tiempo pero en este metodo llamaria a los fav1,fav2,... dependiendo del que en la ventana Pokedex los hayan marcado como favoritos y los pondría visibles

    }


    public void onClickBut2() throws  IOException {
/*


            Parent root = FXMLLoader.load(getClass().getResource("mochila.fxml"));
            Stage primaryStage = new Stage();
            Scene scene = new Scene(root, 300, 275);
            primaryStage.setTitle("Botiquín");
            primaryStage.setScene(scene);
            primaryStage.show();
*/


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Pokedex.fxml"));
        Parent parent = loader.load();
        Stage primaryStage = new Stage();
        Scene scene = new Scene(parent);

        primaryStage.setTitle("Pokedex");
        primaryStage.setScene(scene);
        primaryStage.show();

        Pokedex pokedex = loader.getController();

        /*

        No me da tiempo a solucionar este error al pasar la imagen

        ImageView imagen = new ImageView("C:\\Users\\AlumnoM\\IdeaProjects\\RecuperacionCentroPokemon\\src\\images\\Infernape.png");
        pokedex.setImg(imagen);

         */

        pokedex.setDescripcion(pokemon.getDetalles());
        pokedex.setNombre(pokemon.getNombre());
        pokedex.setSexo(pokemon.getSexo());




        }



}
