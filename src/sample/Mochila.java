package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Mochila {

    int vidaActual = 0;
    int vidaMax = 0;

    public Pokemon pokemon;

   @FXML
   Label label1;

    @FXML
    Button boton;

    @FXML
    Button curar1;

    @FXML
    Button curar2;

    @FXML
    Button curar3;

    @FXML
    Button curar4;


    @FXML
    public void pokemonMochila(Pokemon pokemonMochila) {

        pokemon = pokemonMochila;
        label1.setText(pokemon.getNombre() + " está a " + pokemon.getVida() + " PS");
        vidaActual = pokemon.getVida();
        vidaMax = vidaActual * 2;

    }
    public boolean fullVida(){

        if(vidaActual<vidaMax) {

            boton.setDisable(true);
            return false;

        }else {

            boton.setDisable(false);
            return true;
        }

    }

    @FXML
    public void volverPokemons() throws IOException {

        //No me da tiempo a cambiarlo pero esto lo que hace es abrir una pesataña completamente nueva y tendría que modificarlo para que se cambie la pantalla anterior

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));
        Parent parent = loader.load();

        Stage primaryStage = new Stage();
        Scene scene = new Scene(parent);

        primaryStage.setTitle("Pokemons");
        primaryStage.setScene(scene);
        primaryStage.show();


    }




    public void curar10PS() {
        vidaActual = vidaActual + 10;
        actualizarVida();

    }

    public void curar20PS() {
        vidaActual = vidaActual + 20;
        actualizarVida();

    }

    public void curar10VidMax() {
        vidaActual = (int) (vidaActual + Math.round(vidaMax * 0.1));
        actualizarVida();

    }

    public void curar20VidMax() {
        vidaActual = (int) (vidaActual + Math.round(vidaMax * 0.2));
        actualizarVida();

    }

    public void actualizarVida(){
        if(vidaActual<vidaMax)
        label1.setText(pokemon.getNombre() + " está a " + vidaActual + " PS");
        else{
            label1.setText(pokemon.getNombre() + " está a " + vidaMax + " PS (Vida Máxima)");
            boton.setDisable(false);
        }

    }




}
