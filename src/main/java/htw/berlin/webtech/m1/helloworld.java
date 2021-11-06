package htw.berlin.webtech.WebTech_Projekt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloworld {

    @GetMapping("/")
    public ModelAndView helloWorld(){
        return new ModelAndView("helloworld") ;
    }

}