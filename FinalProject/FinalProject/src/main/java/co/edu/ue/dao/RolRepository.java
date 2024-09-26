package co.edu.ue.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.ue.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
}
