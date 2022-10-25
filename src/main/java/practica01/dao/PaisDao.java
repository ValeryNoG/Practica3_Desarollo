package practica01.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import practica01.domain.Pais;

public interface PaisDao  extends JpaRepository<Pais, Long>{
    
}
