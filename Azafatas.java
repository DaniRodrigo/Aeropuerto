package Aeropuerto;

import java.util.ArrayList;

public class Azafatas extends Personal{
    double sueldo;
    ArrayList <ListaIdiomas> listaIdiomas = new ArrayList<>();

    public Azafatas(String nombre, String apellidos, String dni, String mail, double sueldo, ArrayList<ListaIdiomas> listaIdiomas) {
        super(nombre, apellidos, dni, mail);
        this.sueldo = sueldo;
        this.listaIdiomas = listaIdiomas;
    }
}
