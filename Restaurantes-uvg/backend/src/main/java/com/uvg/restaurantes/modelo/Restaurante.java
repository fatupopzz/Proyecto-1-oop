import java.util.ArrayList;
import java.util.List;

//---CLASE-----------------------------------------------
public class Restaurante {
    private int id;
    private String nombre;
    private String telefono;
    private Usuario propietario;
    private List<String> tiposCocina;
    private double calificacionPromedio;
    private List<Calificacion> calificaciones;

//-----CONSTRUCTOR-----------------------------------------------------------------------------------
    public Restaurante(String nombre, String telefono, Usuario propietario) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.propietario = propietario;
        this.tiposCocina = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
        this.calificacionPromedio = 0.0;
    }

//-----GETTERS Y SETTERS-----------------------------------------------------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    public List<String> getTiposCocina() {
        return tiposCocina;
    }

    public void setTiposCocina(List<String> tiposCocina) {
        this.tiposCocina = tiposCocina;
    }

    public double getCalificacionPromedio() {
        return calificacionPromedio;
    }

    public void setCalificacionPromedio(double calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
