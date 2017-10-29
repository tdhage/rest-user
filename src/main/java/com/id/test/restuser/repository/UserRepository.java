package com.id.test.restuser.repository;

import org.springframework.data.repository.CrudRepository;

import com.id.test.restuser.model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
