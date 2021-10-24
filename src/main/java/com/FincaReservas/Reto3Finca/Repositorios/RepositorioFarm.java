/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FincaReservas.Reto3Finca.Repositorios;

import com.FincaReservas.Reto3Finca.Interfaces.InterfaceFarm;
import com.FincaReservas.Reto3Finca.Modelos.Farm;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioFarm {

    @Autowired
    private InterfaceFarm crud;

    public List<Farm> getAll() {
        return (List<Farm>) crud.findAll();
    }

    public Optional<Farm> getFarm(int id) {
        return crud.findById(id);
    }

    public Farm save(Farm farm) {
        return crud.save(farm);
    }

    public void delete(Farm farm) {
        crud.delete(farm);
    }

}
