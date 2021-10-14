package htw.berlin.webtech.WebTech_Projekt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloworld {

    @GetMapping("/helloworld")
    public String hellowWorld(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "helloworld";
    }

}