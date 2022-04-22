/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 * Clase que muestra los datos de un Perro
 * @author IVAN-PC
 */
public class Perro extends Mascota{
    private boolean colaCortada;

    public Perro() {
    }
/**
 * Metodo que muestra los datos de un Perro
 * @param colaCortada
 * @param color
 * @param raza
 * @param colorOjos 
 */
    public Perro(boolean colaCortada, String color, String raza, String colorOjos) {
        super(color, raza, colorOjos);
        this.colaCortada = colaCortada;
    }
/**
 * Metodo que muestra los datos de un Perro
 * @return 
 */
    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString()+"Perro{" + "colaCortada=" + colaCortada + '}';
    }

}
