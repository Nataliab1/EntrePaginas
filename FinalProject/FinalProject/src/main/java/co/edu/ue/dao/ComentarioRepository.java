package co.edu.ue.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.ue.model.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {
}
