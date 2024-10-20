/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Tienda.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dques
 */
@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String paginaInicio(Model model) {
        //model.addAttribute("attribute", "value");
        return "index";
    }
    
    @RequestMapping("/contacto")
    public String paginaInfo(Model model) {
        //model.addAttribute("attribute", "value");
        return "informacion";
    }
    
}
