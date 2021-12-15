/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cuatroa.retotres.interfaces;

import java.util.List;
import com.cuatroa.retotres.model.Chocolate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author JUAN JIMENEZ
 */
public interface InterfaceChocolate extends MongoRepository<Chocolate, String> {
    //Reto 5
    public List<Chocolate> findByPriceLessThanEqual(double precio);
    
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Chocolate> findByDescriptionLike(String description); 
}
