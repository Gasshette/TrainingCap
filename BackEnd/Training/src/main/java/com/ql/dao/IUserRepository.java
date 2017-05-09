package com.ql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ql.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
