package co.edu.ue.controller;

import co.edu.ue.model.Usuario;
import co.edu.ue.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value="/listar",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping(value="/guardar", produces = MediaType.APPLICATION_JSON_VALUE, consumes =  MediaType.APPLICATION_JSON_VALUE)
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping(value="/eliminar/{id}" )
    public void eliminarUsuario(@PathVariable int id) {
        usuarioService.eliminarUsuario(id);
    }

    @GetMapping(value="/obtener/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Usuario obtenerUsuarioPorId(@PathVariable int id) {
        return usuarioService.obtenerUsuarioPorId(id);
    }
}
