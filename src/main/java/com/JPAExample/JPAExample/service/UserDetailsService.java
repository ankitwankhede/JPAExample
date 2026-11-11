package com.JPAExample.JPAExample.service;

import com.JPAExample.JPAExample.entity.UserDetails;
import com.JPAExample.JPAExample.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public void saveUser(UserDetails userDetails) {
        userDetailsRepository.save(userDetails);
    }

    public UserDetails findByID(Long privateKey) {
        return userDetailsRepository.findById(privateKey).get();
    }
}
