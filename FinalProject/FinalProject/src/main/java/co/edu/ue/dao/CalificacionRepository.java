package co.edu.ue.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.ue.model.Calificacion;

@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion, Integer> {
}
