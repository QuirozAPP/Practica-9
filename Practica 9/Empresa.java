public class Empresa {
    private String nombre;
    private String direccion;
    private Flota flota;

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.flota = new Flota();
    }

    public Flota getFlota() {
        return flota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
