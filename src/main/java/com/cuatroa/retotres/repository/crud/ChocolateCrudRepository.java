package com.cuatroa.retotres.repository.crud;

import java.util.List;

import com.cuatroa.retotres.model.Chocolate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author JUAN JIMENEZ
 */
public interface ChocolateCrudRepository extends MongoRepository<Chocolate, String> {
   //Reto 5
    public List<Chocolate> findByPriceLessThanEqual(double precio);
    
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Chocolate> findByDescriptionLike(String description); 
}