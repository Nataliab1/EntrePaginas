package co.edu.ue.service;

import co.edu.ue.model.Rol;
import co.edu.ue.dao.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public List<Rol> listarRoles() {
        return rolRepository.findAll();
    }

    public Rol guardarRol(Rol rol) {
        return rolRepository.save(rol);
    }

    public void eliminarRol(int id) {
        rolRepository.deleteById(id);
    }

    public Rol obtenerRolPorId(int id) {
        return rolRepository.findById(id).orElse(null);
    }
}
