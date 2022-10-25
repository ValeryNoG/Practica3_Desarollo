package practica01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import practica01.domain.Pais;
import practica01.dao.PaisDao;
import practica01.service.PaisService;

@Controller 
@Slf4j
public class PaisController {
    @Autowired
    private PaisService paisService;

    @GetMapping("/pais/nuevo")
    public String clienteNuevo(Pais pais){
      //Presenta pantalla
        return "modificarCliente";
    }

    @GetMapping("/pais/guardar")
    public String paisGuardar(Pais pais){
      //Presenta pantalla
        paisService.save(pais);
        return "redirect:/";
    }

    @GetMapping("/pais/modificar{idPais}")
    public String paisModificar(Pais pais, Model model){
       pais=paisService.getPais(pais);
       model.addAttribute("pais",pais);
       return "modificarCliente";
    }

    @GetMapping("/pais/eliminar/{isPais}")
    public String clienteElimianar(Pais pais ){
      paisService.delete(pais);
      return "redirect:/";
    }
}
