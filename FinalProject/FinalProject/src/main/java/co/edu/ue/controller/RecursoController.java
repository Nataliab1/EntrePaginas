package co.edu.ue.controller;

import co.edu.ue.model.Recurso;
import co.edu.ue.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recursos")
public class RecursoController {

    @Autowired
    private RecursoService recursoService;

    @GetMapping(value="/listar",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Recurso> listarRecursos() {
        return recursoService.listarRecursos();
    }

    @PostMapping(value="/guardar", produces = MediaType.APPLICATION_JSON_VALUE, consumes =  MediaType.APPLICATION_JSON_VALUE)
    public Recurso guardarRecurso(@RequestBody Recurso recurso) {
        return recursoService.guardarRecurso(recurso);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarRecurso(@PathVariable int id) {
        recursoService.eliminarRecurso(id);
    }

    @GetMapping(value="/obtener/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Recurso obtenerRecursoPorId(@PathVariable int id) {
        return recursoService.obtenerRecursoPorId(id);
    }
}
