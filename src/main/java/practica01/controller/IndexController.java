package practica01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import practica01.service.PaisService;

@Controller 
@Slf4j
public class IndexController {
    @Autowired
    private PaisService paisService;
    @GetMapping("/")
    public String inicio(Model model){
        
        var paises=paisService.getPaises();
        model.addAttribute("pais" , paises);
        return "index";
    }
}
