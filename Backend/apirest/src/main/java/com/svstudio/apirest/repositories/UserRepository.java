package com.svstudio.apirest.repositories;

import com.svstudio.apirest.models.Role;
import com.svstudio.apirest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
 boolean existsByEmail(String email);

}
