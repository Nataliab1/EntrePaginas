package co.edu.ue.service;

import co.edu.ue.model.Calificacion;
import co.edu.ue.dao.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    public List<Calificacion> listarCalificaciones() {
        return calificacionRepository.findAll();
    }

    public Calificacion guardarCalificacion(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    public void eliminarCalificacion(int id) {
        calificacionRepository.deleteById(id);
    }

    public Calificacion obtenerCalificacionPorId(int id) {
        return calificacionRepository.findById(id).orElse(null);
    }
}
