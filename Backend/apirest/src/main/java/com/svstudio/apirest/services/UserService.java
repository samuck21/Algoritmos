package com.svstudio.apirest.services;

import com.svstudio.apirest.dto.user.CreateUserRequest;
import com.svstudio.apirest.models.User;
import com.svstudio.apirest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
 @Autowired
    private UserRepository userRepository;
 @Transactional
 public User create(CreateUserRequest request){
       if(userRepository.existsByEmail(request.email)){
           throw new RuntimeException("El correo ya esta registrado");
       }
       User user = new User();
       user.setName(request.name);
       user.setLastname(request.lastname);
       user.setPhone(request.phone);
       user.setEmail(request.name);
       user.setPassword(request.name);
       return userRepository.save(user);
   }
}
