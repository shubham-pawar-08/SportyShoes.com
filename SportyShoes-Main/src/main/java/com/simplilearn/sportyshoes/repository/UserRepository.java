package com.simplilearn.sportyshoes.repository;

import com.simplilearn.sportyshoes.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {


    Users getByEmail(String email);

    @Query(value = "SELECT u FROM Users u ORDER BY u.firstName ASC")
    List<Users> findUsersOrderByName();
}
