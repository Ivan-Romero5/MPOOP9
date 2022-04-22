/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase que muestra los datos de un SerVivo
 * @author alumno
 */
public abstract class SerVivo {
    public String nombre;
    public int edad;
/**
 * Metodo que muestra los datos de un SerVivo
 * @return Nombre y edad de un SerVivo
 */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "SerVivo{" + '}';
    }

}
