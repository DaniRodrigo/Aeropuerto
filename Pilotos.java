package Aeropuerto;

import org.w3c.dom.ls.LSOutput;

public class Pilotos extends Personal{
    Rango r;
    double sueldo;
    boolean vuelosInt;

    public Pilotos(String nombre, String apellidos, String dni, String mail, Rango r, double sueldo, boolean vuelosInt) {
        super(nombre, apellidos, dni, mail);
        this.r = r;
        this.sueldo = sueldo;
        this.vuelosInt = vuelosInt;
    }


}
