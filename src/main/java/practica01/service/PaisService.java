/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practica01.service;

import java.util.List;
import practica01.domain.Pais;

public interface PaisService {
    public List<Pais> getPaises();

    public Pais getPais(Pais pais);

    public void save(Pais pais);

    public void delete(Pais pais);
}
