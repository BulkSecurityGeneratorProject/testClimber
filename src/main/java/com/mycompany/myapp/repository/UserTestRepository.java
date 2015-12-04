package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.UserTest;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the UserTest entity.
 */
public interface UserTestRepository extends JpaRepository<UserTest,Long> {

}
