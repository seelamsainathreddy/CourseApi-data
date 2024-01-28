package io.javabrains.SocialWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.SocialWebsite.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}