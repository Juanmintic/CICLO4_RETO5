package com.cuatroa.retotres.repository;

import com.cuatroa.retotres.model.User;
import com.cuatroa.retotres.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JUAN JIMENEZ
 */

@Repository
public class UserRepository {
/**
 *crear un objeto de crud
 * @author JUAN JIMENEZ
 */

    @Autowired
    private UserCrudRepository userCrudRepository;
/**
 *
 * @author JUAN JIMENEZ
 */
    
    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }
/**
 *
 * @author JUAN JIMENEZ
 */
    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }
/**
 *para crear
 * @author JUAN JIMENEZ
 */
    public User create(User user) {
        return userCrudRepository.save(user);
    }
 /**
 *
 * @author JUAN JIMENEZ
 */   
    public void update(User user) {
        userCrudRepository.save(user);
    }
 /**
 *para eliminar
 * @author JUAN JIMENEZ
 */   
    public void delete(User user) {
        userCrudRepository.delete(user);
    }
/**
 *
 * @author JUAN JIMENEZ
 */
    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);
        
        return !usuario.isEmpty();
    }
  /**
 *para autenticar
 * @author JUAN JIMENEZ
 */  
    public Optional<User> authenticateUser(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
 /**
 *para consulta ultimo usuario
 * @author JUAN JIMENEZ
 */   
    public Optional<User> lastUserId(){
        return userCrudRepository.findTopByOrderByIdDesc();
    }
/**
 *para consulta de cumpleaños
 * @author JUAN JIMENEZ
 */
    public List<User> listBirthtDayMonth(String month){
        return userCrudRepository.findByMonthBirthtDay(month);
    }
}
