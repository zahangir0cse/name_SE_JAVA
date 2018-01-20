package com.zahangir.repository;

import org.springframework.data.repository.CrudRepository;
import com.zahangir.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
