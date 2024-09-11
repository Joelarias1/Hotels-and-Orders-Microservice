package com.pruebajoelarias2.pruebas3joelarias.petorders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.pruebajoelarias2.pruebas3joelarias.petorders.dto.OrdenDTO;
import com.pruebajoelarias2.pruebas3joelarias.petorders.service.OrdenService;

@RestController
@RequestMapping("/api/ordenes")
public class OrdenController {

    @Autowired
    private OrdenService ordenService; // Inyección del servicio con @Autowired


    // GET All Order
    @GetMapping
    public List<OrdenDTO> getAllOrders() {
        return ordenService.getAllOrders(); 
    }
}
