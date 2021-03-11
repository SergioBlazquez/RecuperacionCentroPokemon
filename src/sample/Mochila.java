package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.awt.*;
import java.io.IOException;

public class Mochila {

    int vidaActual = 0;
    int vidaMax = 0;

    public Pokemon pokemon;

    @FXML
    public Label label1;
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
            boton.setEnabled(false);
            return false;

        }else {

            boton.setEnabled(true);
            return true;
        }

    }

    @FXML
    public void volverPokemons() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));
        Parent parent = loader.load();

    }




    public void curar10PS() {
        vidaActual = vidaActual + 10;

    }

    public void curar20PS() {
        vidaActual = vidaActual + 20;

    }

    public void curar10VidMax() {
        vidaActual = (int) (vidaActual + Math.round(vidaMax * 0.1));

    }

    public void curar20VidMax() {
        vidaActual = (int) (vidaActual + Math.round(vidaMax * 0.2));

    }






}
