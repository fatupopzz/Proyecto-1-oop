package restaurantes.uvg.backend.src.main.java.controladores;

import java.util.List;

/**
 * Controlador REST para gestionar restaurantes.
 */
@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @PostMapping
    public ResponseEntity<Restaurante> crearRestaurante(@RequestBody Restaurante restaurante) {
        Restaurante nuevoRestaurante = restauranteService.crearRestaurante(restaurante);
        return ResponseEntity.ok(nuevoRestaurante);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurante> obtenerRestaurantePorId(@PathVariable int id) {
        Restaurante restaurante = restauranteService.obtenerRestaurantePorId(id);
        if (restaurante != null) {
            return ResponseEntity.ok(restaurante);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Restaurante>> listarRestaurantes() {
        List<Restaurante> restaurantes = restauranteService.listarRestaurantes();
        return ResponseEntity.ok(restaurantes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Restaurante> actualizarRestaurante(@PathVariable int id, @RequestBody Restaurante restaurante) {
        Restaurante restauranteActualizado = restauranteService.actualizarRestaurante(id, restaurante);
        if (restauranteActualizado != null) {
            return ResponseEntity.ok(restauranteActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarRestaurante(@PathVariable int id) {
        boolean eliminado = restauranteService.eliminarRestaurante(id);
        if (eliminado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Restaurante>> buscarRestaurantesPorNombre(@RequestParam String nombre) {
        List<Restaurante> restaurantes = restauranteService.buscarRestaurantesPorNombre(nombre);
        return ResponseEntity.ok(restaurantes);
    }

    @GetMapping("/mejor-calificados")
    public ResponseEntity<List<Restaurante>> obtenerMejoresRestaurantes() {
        List<Restaurante> restaurantes = restauranteService.obtenerMejoresRestaurantes();
        return ResponseEntity.ok(restaurantes);
    }
}
