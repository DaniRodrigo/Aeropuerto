package Aeropuerto;

public class Pasajeros extends Personal{
    String numPasaporte;

    public Pasajeros(String nombre, String apellidos, String dni, String mail, String numPasaporte) {
        super(nombre, apellidos, dni, mail);
        this.numPasaporte = numPasaporte;
    }
}
