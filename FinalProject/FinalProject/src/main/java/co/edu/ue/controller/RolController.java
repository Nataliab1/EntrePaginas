package co.edu.ue.controller;

import co.edu.ue.model.Rol;
import co.edu.ue.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping(value="/listar",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Rol> listarRoles() {
        return rolService.listarRoles();
    }

    @PostMapping(value="/guardar", produces = MediaType.APPLICATION_JSON_VALUE, consumes =  MediaType.APPLICATION_JSON_VALUE)
    public Rol guardarRol(@RequestBody Rol rol) {
        return rolService.guardarRol(rol);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarRol(@PathVariable int id) {
        rolService.eliminarRol(id);
    }

    @GetMapping(value="/obtener/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Rol obtenerRolPorId(@PathVariable int id) {
        return rolService.obtenerRolPorId(id);
    }
}
