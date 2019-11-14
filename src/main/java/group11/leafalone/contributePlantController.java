package group11.leafalone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class contributePlantController {
    @GetMapping("/contributePlant")
    public String contributePlantForm(Model model) {
        model.addAttribute("plantdescription", new PlantDescription());
        return "contributePlant";
    }

    @PostMapping("/contributePlant")
    public String contributePlantSubmit(@ModelAttribute PlantDescription plantdescription) {
        return "aboutUs";
    }
}
