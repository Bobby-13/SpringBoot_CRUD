package com.backend.SimpleWebAppBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<Users,String> {

    List<Users> findByEmailContaining(String query);

}
