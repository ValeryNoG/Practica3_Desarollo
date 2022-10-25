/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practica01.service;

import java.util.List;
import practica01.domain.Estado;

public interface EstadoService {
    public List<Estado> getEstados();

    public Estado getEstado(Estado estado);

    public void save(Estado estado);

    public void delete(Estado estado);
}
