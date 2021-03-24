package sample;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Pokemon {

    String nombre="";
    Integer vida=0;
    Boolean sexo=false;
    String detalles="";


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVida() {
        return vida;
    }


    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public boolean getSexo(){return sexo;}

    public void setSexo(Boolean sexo){this.sexo=sexo;}

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

}
