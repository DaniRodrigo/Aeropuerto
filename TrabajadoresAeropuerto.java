package Aeropuerto;

public class TrabajadoresAeropuerto extends Personal{
    double sueldo;

    public TrabajadoresAeropuerto(String nombre, String apellidos, String dni, String mail, double sueldo) {
        super(nombre, apellidos, dni, mail);
        this.sueldo = sueldo;
    }
}
