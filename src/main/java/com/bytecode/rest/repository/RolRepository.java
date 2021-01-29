package com.bytecode.rest.repository;

import com.bytecode.rest.entity.Rol;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
@PreAuthorize("isAuthenticated()")
public interface RolRepository extends PagingAndSortingRepository<Rol, Serializable> {
}
