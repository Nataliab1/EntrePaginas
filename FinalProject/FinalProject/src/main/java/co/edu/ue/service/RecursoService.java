package co.edu.ue.service;

import co.edu.ue.model.Recurso;
import co.edu.ue.dao.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecursoService {

    @Autowired
    private RecursoRepository recursoRepository;

    public List<Recurso> listarRecursos() {
        return recursoRepository.findAll();
    }

    public Recurso guardarRecurso(Recurso recurso) {
        return recursoRepository.save(recurso);
    }

    public void eliminarRecurso(int id) {
        recursoRepository.deleteById(id);
    }

    public Recurso obtenerRecursoPorId(int id) {
        return recursoRepository.findById(id).orElse(null);
    }
}
