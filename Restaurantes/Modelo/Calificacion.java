package Restaurantes.Modelo;

//---IMPORTS---------------------------------------------
import java.util.Date;
import java.util.List;

//---CLASE-----------------------------------------------
public class Calificacion {
    private int id;
    private Usuario usuario;
    private Restaurante restaurante;
    private int puntuacion;
    private String comentario;
    private Date fecha;

//-----CONSTRUCTOR-----------------------------------------------------------------------------------
    public Calificacion(Usuario usuario, Restaurante restaurante, int puntuacion, String comentario) {
        this.usuario = usuario;
        this.restaurante = restaurante;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.fecha = new Date();
    }

//-----GETTERS Y SETTERS-----------------------------------------------------------------------------
        public int getId() {
            return id;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public Restaurante getRestaurante() {
            return restaurante;
        }

        public int getPuntuacion() {
            return puntuacion;
        }

        public String getComentario() {
            return comentario;
        }

        public Date getFecha() {
            return fecha;
        }

        // Setters
        public void setPuntuacion(int puntuacion) {
            this.puntuacion = puntuacion;
        }

        public void setComentario(String comentario) {
            this.comentario = comentario;
        }

        public double getCalificacion() {
            return puntuacion;
        }

        public double getValor() {
            return puntuacion;
        }
        

//----------------------------------METODOS----------------------------------------------------------

    //actualiza la puntuacion y comentario de la calificacion
    public void actualizarCalificacion(int puntuacion, String comentario) {
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }
    //verifica si la calificacion esta en un rango valido del 1 al 5
    public boolean esCalificacionValida() {
        return this.puntuacion >= 1 && this.puntuacion <= 5;
    }
    //Devuelve una representación en cadena de la calificación, usando solo el nombre del usuario y del restaurante
    @Override
    public String toString() {
        return "Calificacion{" +
                "id=" + id +
                ", usuario=" + (usuario != null ? usuario.getNombre() : "N/A") +
                ", restaurante=" + (restaurante != null ? restaurante.getNombre() : "N/A") +
                ", puntuacion=" + puntuacion +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                '}';
    }

    //comparar la calificacion con otra basada en el id 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Calificacion that = (Calificacion) obj;
        return id == that.id;
    }

    //calcular el hashcode de la calificacion basado en el id (unico)
        /*El hashcode de un objeto es un número entero que se utiliza para identificar de forma única un objeto en una colección.
        En este caso, el hashcode de una calificación se basa en el id de la calificación, que se supone que es único para cada calificación.
        Por lo tanto, dos calificaciones con el mismo id tendrán el mismo hashcode, lo que es útil para comparar y buscar calificaciones en colecciones 
        como conjuntos y mapas.
        */
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    //calcular el promedio de la lista de calificaciones
    public static double calcularPromedio(List<Calificacion> calificaciones) {
        double suma = 0;
        for(Calificacion c : calificaciones){
            suma += c.getPuntuacion();
        }
        return suma / calificaciones.size();
    }

}
