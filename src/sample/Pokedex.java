package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;


public class Pokedex {


    @FXML
    Label label1;

    @FXML
    Label label2;

    @FXML
    ImageView img;

    @FXML
    TextArea txt;

    @FXML
    CheckBox chc1;

    @FXML
    Button botVolver;


    public void setImg(ImageView image) {

        img.setImage(Image.impl_fromPlatformImage(image));

    }

    public void setNombre(String nombre) {
        label1.setText(nombre);
    }

    public void setSexo(Boolean sexo) {
        if (sexo)
            label2.setText("Masculino");
        else
            label2.setText("Femenino");

    }

    public void setDescripcion(String desc) {
        txt.setText(desc);
    }

    public void volverPokemon() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Controller.fxml"));
        Parent parent = loader.load();
        Stage primaryStage = new Stage();
        Scene scene = new Scene(parent);

        primaryStage.setTitle("Pokedex");
        primaryStage.setScene(scene);
        primaryStage.show();

        Controller controller = loader.getController();


        //No me da tiempo pero aqui dependiendo del Pokemon que me pasaran del Controller lo devolveria para que el ImageView de la estrella fuera visible
        controller.esFavorito();

    }

}