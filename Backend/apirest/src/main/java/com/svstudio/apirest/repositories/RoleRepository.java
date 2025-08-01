package com.svstudio.apirest.repositories;

import com.svstudio.apirest.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,String> {
 boolean existsByName(String name);

}
