/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 * Clase que muestra los datos de una Mascota
 * @author IVAN-PC
 */
public abstract class Mascota extends SerVivo{
    String color;
    String raza;
    String colorOjos;

    public Mascota() {
    }
/**
 * Metodo que muestra los datos de una Mascota
 * @param color
 * @param raza
 * @param colorOjos 
 */
    public Mascota(String color, String raza, String colorOjos) {
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }
/**
 * Metodo que muestra los datos de una Mascota
 * @return color, edad, raza, color de ojos
 */
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
        return super.toString()+"Mascota{" + "color=" + color + ", raza=" + raza + ", colorOjos=" + colorOjos + '}';
    }

}
