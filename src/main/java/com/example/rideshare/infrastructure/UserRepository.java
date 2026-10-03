package com.example.rideshare.infrastructure;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean exists ByUsername (String username);
    boolean exists ByRoute (String route);

}
