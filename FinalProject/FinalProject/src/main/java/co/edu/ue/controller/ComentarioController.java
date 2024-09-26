package co.edu.ue.controller;

import co.edu.ue.model.Comentario;
import co.edu.ue.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @GetMapping(value="/listar",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Comentario> listarComentarios() {
        return comentarioService.listarComentarios();
    }

    @PostMapping(value="/guardar", produces = MediaType.APPLICATION_JSON_VALUE, consumes =  MediaType.APPLICATION_JSON_VALUE)
    public Comentario guardarComentario(@RequestBody Comentario comentario) {
        return comentarioService.guardarComentario(comentario);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarComentario(@PathVariable int id) {
        comentarioService.eliminarComentario(id);
    }

    @GetMapping(value="/obtener/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Comentario obtenerComentarioPorId(@PathVariable int id) {
        return comentarioService.obtenerComentarioPorId(id);
    }
}
