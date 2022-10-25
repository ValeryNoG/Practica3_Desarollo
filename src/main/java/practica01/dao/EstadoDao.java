package practica01.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import practica01.domain.Estado;

public interface EstadoDao  extends JpaRepository<Estado, Long>{
    
}
