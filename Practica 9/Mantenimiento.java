import java.util.Date;

public class Mantenimiento {
    private String tipoMantenimiento;
    private Date fecha;
    private double costo;

    public Mantenimiento(String tipoMantenimiento, Date fecha, double costo) {
        this.tipoMantenimiento = tipoMantenimiento;
        this.fecha = fecha;
        this.costo = costo;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getCosto() {
        return costo;
    }
}
