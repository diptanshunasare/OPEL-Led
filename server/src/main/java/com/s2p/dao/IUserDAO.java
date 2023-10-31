package com.s2p.dao;
import com.s2p.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
public interface IUserDAO extends JpaRepository<User, Long> {
//    User findByUsername(String username);
    User findByEmail(String email);
}