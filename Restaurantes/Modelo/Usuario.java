
package Restaurantes.Modelo;
//---IMPORTS---------------------------------------------
import java.util.Date;

//---CLASE-----------------------------------------------
public class Usuario{
    private int id;
    private String nombre;
    private String email;
    private String contrasena;
    private Date fecharegistro;
    private boolean esAdministrador;
//-----CONSTRUCTOR-----------------------------------------------------------------------------------
public Usuario(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contraseña;
        this.fecharegistro = new Date();
        this.esAdministrador = false;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Date getFecharegistro() {
        return fecharegistro;
    }
    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    public boolean isEsAdministrador() {
        return esAdministrador;
    }
    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }
//-----Metodos---------------------------------------------------------------------------------------
    //metodo para verificar la contraseña
    public boolean verificarContrasena(String contrasena){
        return this.contrasena.equals(contrasena);
    }
    //devolver los datos menos la contraseña
    public String toString(){
        return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + ", fecharegistro=" + fecharegistro + ", esAdministrador=" + esAdministrador + "]";
    }
}