package com.christ.smartvideo2.service;

import com.christ.smartvideo2.domain.User1;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserDao extends JpaRepository<User1, Long> {
    public User1 findByEmail(String email);
}
