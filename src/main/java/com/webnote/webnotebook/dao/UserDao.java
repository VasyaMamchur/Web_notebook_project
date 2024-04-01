package com.webnote.webnotebook.dao;

import com.webnote.webnotebook.dao.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<User, Integer> {
    User findByName(String name);
    User findByPassword(String password);
}
