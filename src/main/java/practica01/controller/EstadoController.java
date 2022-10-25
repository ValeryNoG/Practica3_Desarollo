package practica01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import practica01.domain.Estado;
import practica01.dao.EstadoDao;
import practica01.service.EstadoService;

@Controller 
@Slf4j
public class EstadoController {
    @Autowired
    private EstadoService estadoService;

    @GetMapping("/estado/nuevo")
    public String estadoNuevo(Estado estado){
      //Presenta pantalla
        return "modificarEstado";
    }

    @GetMapping("/estado/guardar")
    public String estadoGuardar(Estado estado){
      //Presenta pantalla
        estadoService.save(estado);
        return "redirect:/";
    }

    @GetMapping("/estado/modificar{idEstado}")
    public String estadoModificar(Estado estado, Model model){
       estado=estadoService.getEstado(estado);
       model.addAttribute("estado",estado);
       return "modificarEstado";
    }

    @GetMapping("/estado/eliminar/{idEstado}")
    public String estadoElimianar(Estado estado){
      estadoService.delete(estado);
      return "redirect:/";
    }
}
