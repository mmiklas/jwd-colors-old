package pl.edu.wszib.jwd.colors23.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwd.colors23.service.SelectedColorService;

@Controller
public class DataController {

    @Value("${app.title.data}")
    private String title;

    @Autowired
    SelectedColorService selectedColorService;

    @GetMapping("/data")
    public String showDataPage(Model model) {
        model.addAttribute("title", title);
        model.addAttribute("selectedColors", selectedColorService.getAllData());
        return "data";
    }
}
