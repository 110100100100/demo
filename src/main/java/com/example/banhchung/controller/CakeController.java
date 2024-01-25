package com.example.banhchung.controller;


import com.example.banhchung.model.Cake;
import com.example.banhchung.service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cakes")
public class CakeController {
    @Autowired
    private CakeService cakeService;

    @GetMapping()
    public String showAllCakes(Model model){
        List<Cake> cakes = cakeService.getAllListCake();
        model.addAttribute("cakes", cakes);

        return "list";
    }

    @GetMapping("/add-cake")
    public String showAddCakeForm(Model model) {
        Cake trungCake = new Cake();
        model.addAttribute("cake", trungCake);

        return "create";
    }

    @GetMapping("/edit/{id}")
    public String showEditCakeForm(@PathVariable int id, Model model) {

        model.addAttribute("cake", cakeService.findById(id));
        return "edit";
    }

    @GetMapping("/search")
    public String showEditCakeForm(@RequestParam("keyword") String keyword, Model model) {


        model.addAttribute("cakes", cakeService.searchWithKeyword(keyword));

        return "list";

    }

    @PostMapping("/create")
    public String createCake(@ModelAttribute Cake trungCake) {
        cakeService.createCake(trungCake);

        return "redirect:/cakes";
    }

    @PostMapping("/update")
    public String updateCake(@ModelAttribute Cake trungCake) {
        cakeService.updateCake(trungCake);

        return "redirect:/cakes";
    }

    @GetMapping("/delete/{id}")
    public String deleteCake(@PathVariable int id) {
        cakeService.deleteById(id);
        return "redirect:/cakes";
    }

}
