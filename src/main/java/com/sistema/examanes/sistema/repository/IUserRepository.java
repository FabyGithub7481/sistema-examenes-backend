package com.sistema.examanes.sistema.repository;

import com.sistema.examanes.sistema.entidades.UserT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserT,Long> {

  public UserT findByUserName(String userName);
}
