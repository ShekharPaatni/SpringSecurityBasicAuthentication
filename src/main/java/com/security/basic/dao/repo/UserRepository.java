package com.security.basic.dao.repo;

import com.security.basic.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "SELECT * FROM user where TIMESTAMPDIFF(HOUR, created_date, NOW()) and status = :status", nativeQuery = true)
    public List<User> find(@Param("status") String status);
}
