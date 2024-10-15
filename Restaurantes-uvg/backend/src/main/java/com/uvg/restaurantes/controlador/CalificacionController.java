package restaurantes.uvg.backend.src.main.java.controladores;

import java.util.List;

/**
 * Controlador REST para gestionar calificaciones.
 */
@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;

    @PostMapping
    public ResponseEntity<Calificacion> crearCalificacion(@RequestBody Calificacion calificacion) {
        Calificacion nuevaCalificacion = calificacionService.crearCalificacion(calificacion);
        return ResponseEntity.ok(nuevaCalificacion);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calificacion> obtenerCalificacionPorId(@PathVariable int id) {
        Calificacion calificacion = calificacionService.obtenerCalificacionPorId(id);
        if (calificacion != null) {
            return ResponseEntity.ok(calificacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Calificacion>> listarCalificaciones() {
        List<Calificacion> calificaciones = calificacionService.listarCalificaciones();
        return ResponseEntity.ok(calificaciones);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Calificacion> actualizarCalificacion(@PathVariable int id, @RequestBody Calificacion calificacion) {
        Calificacion calificacionActualizada = calificacionService.actualizarCalificacion(id, calificacion);
        if (calificacionActualizada != null) {
            return ResponseEntity.ok(calificacionActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCalificacion(@PathVariable int id) {
        boolean eliminado = calificacionService.eliminarCalificacion(id);
        if (eliminado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/por-restaurante/{restauranteId}")
    public ResponseEntity<List<Calificacion>> obtenerCalificacionesPorRestaurante(@PathVariable int restauranteId) {
        List<Calificacion> calificaciones = calificacionService.obtenerCalificacionesPorRestaurante(restauranteId);
        return ResponseEntity.ok(calificaciones);
    }

    @GetMapping("/promedio/{restauranteId}")
    public ResponseEntity<Double> calcularPromedioCalificaciones(@PathVariable int restauranteId) {
        double promedio = calificacionService.calcularPromedioCalificaciones(restauranteId);
        return ResponseEntity.ok(promedio);
    }
}
