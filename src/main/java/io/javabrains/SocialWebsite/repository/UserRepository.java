package io.javabrains.SocialWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.SocialWebsite.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
