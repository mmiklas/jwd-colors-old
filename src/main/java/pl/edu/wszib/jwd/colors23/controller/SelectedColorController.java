package pl.edu.wszib.jwd.colors23.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.edu.wszib.jwd.colors23.dao.SelectedColorDao;
import pl.edu.wszib.jwd.colors23.model.SelectedColor;
import pl.edu.wszib.jwd.colors23.service.SelectedColorService;

import java.util.Date;

@Controller
public class SelectedColorController {

    @Value("${app.title.select}")
    private String title;

    @Autowired
    SelectedColorService selectedColorService;

    @GetMapping({"/select/{color}", "/select"})
    public String selectColorPage(@PathVariable(required = false) String color, Model model) {

        if (color != null && color != "") {
            selectedColorService.save(new SelectedColor(color, new Date()));
        }

        //kolory z pliku CSS.java
        String[][] colors = {
                {"red", "blue", "purple", "teal"},
                {"black","orange", "yellow", "green"},
                {"gray","silver", "olive", "lime"},
                {"navy","white", "aqua", "fuchsia"}
        };

        model.addAttribute("colors", colors);
        model.addAttribute("title", title);
        return "select";
    }

    @GetMapping("/")
    public String showIndex() {
        return "redirect:select";
    }
}
