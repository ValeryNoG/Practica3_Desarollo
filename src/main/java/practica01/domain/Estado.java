
package practica01.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data 
@Entity
@Table(name="estado")
public class Estado implements Serializable{
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    String NombrePais;
    String Capital;
    int  Poblacion;
    int  Costas;

    public Estado() {
    }

    public Estado(Long id_pais, String NombrePais, String Capital, int Poblacion, int Costas) {
        
        this.NombrePais = NombrePais;
        this.Capital = Capital;
        this.Poblacion = Poblacion;
        this.Costas = Costas;
    }
    
    
   

    
}
