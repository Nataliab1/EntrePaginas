package co.edu.ue.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.ue.model.Recurso;

@Repository
public interface RecursoRepository extends JpaRepository<Recurso, Integer> {
}
