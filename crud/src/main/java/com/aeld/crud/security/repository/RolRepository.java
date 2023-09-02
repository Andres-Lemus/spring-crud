package com.aeld.crud.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aeld.crud.security.entity.Rol;
import com.aeld.crud.security.enums.RolNombre;

public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
