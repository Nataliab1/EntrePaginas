package co.edu.ue.service;

import co.edu.ue.model.Comentario;
import co.edu.ue.dao.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    public List<Comentario> listarComentarios() {
        return comentarioRepository.findAll();
    }

    public Comentario guardarComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    public void eliminarComentario(int id) {
        comentarioRepository.deleteById(id);
    }

    public Comentario obtenerComentarioPorId(int id) {
        return comentarioRepository.findById(id).orElse(null);
    }
}
