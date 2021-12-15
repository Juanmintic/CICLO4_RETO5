package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author JUAN JIMENEZ
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);
    
    //Para seleccionar el usuario con el id maximo
    Optional<User> findTopByOrderByIdDesc();

//Reto 5: Listado de cumpleaños del mes
    List<User> findByMonthBirthtDay(String month);

}
