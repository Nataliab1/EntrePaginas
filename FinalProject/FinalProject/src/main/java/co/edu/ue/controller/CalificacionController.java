package co.edu.ue.controller;

import co.edu.ue.model.Calificacion;
import co.edu.ue.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calificaciones")
public class CalificacionController {

	
    @Autowired
    private CalificacionService calificacionService;

    @GetMapping(value="/listar",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Calificacion> listarCalificaciones() {
        return calificacionService.listarCalificaciones();
    }

    @PostMapping(value="/guardar", produces = MediaType.APPLICATION_JSON_VALUE, consumes =  MediaType.APPLICATION_JSON_VALUE)
    public Calificacion guardarCalificacion(@RequestBody Calificacion calificacion) {
        return calificacionService.guardarCalificacion(calificacion);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarCalificacion(@PathVariable int id) {
        calificacionService.eliminarCalificacion(id);
    }

    @GetMapping(value="/obtener/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Calificacion obtenerCalificacionPorId(@PathVariable int id) {
        return calificacionService.obtenerCalificacionPorId(id);
    }
}
