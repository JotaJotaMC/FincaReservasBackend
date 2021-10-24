/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.FincaReservas.Reto3Finca.Interfaces;

import com.FincaReservas.Reto3Finca.Modelos.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author JotaJotaMC
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer> {
    
}
