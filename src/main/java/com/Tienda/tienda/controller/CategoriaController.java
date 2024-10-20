/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Tienda.tienda.controller;

import com.Tienda.tienda.domain.Categoria;
import com.Tienda.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dques
 */
@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    CategoriaService categoriaService;
    
    @RequestMapping("/listado")
    public String inicio(Model model) {
        List<Categoria> lista = categoriaService.getCategorias(false);
        model.addAttribute("categorias", lista);
        model.addAttribute("totalCategorias", lista.size());
        
        return "/categoria/listado";
    }
    
}
