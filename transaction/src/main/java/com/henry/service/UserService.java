package com.henry.service;

import com.henry.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Transactional()
    public void Update() {
        userRepo.UpdateNickname("Hook");
        int i = 1 / 0;
        userRepo.UpdateNickname("Gina");
    }
}
