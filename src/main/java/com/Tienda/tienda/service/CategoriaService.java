/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.tienda.service;

import com.Tienda.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author dques
 */
public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
}
