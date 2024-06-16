package com.henry.service;

import com.henry.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Transactional(timeout = 3)
    public void update() {
        updateNickname();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateNickname() {
        userRepo.UpdateNickname("Hook");
        try {
            Thread.sleep(5000);
        } catch (Throwable e) {
            System.out.println(e);
        }
        userRepo.UpdateNickname("Gina");
    }
}
