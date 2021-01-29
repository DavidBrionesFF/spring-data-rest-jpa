package com.bytecode.rest.repository;

import com.bytecode.rest.entity.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@Repository("empleado")
@CrossOrigin(value = {})
@RepositoryRestResource(path = "empleado")
@PreAuthorize("isAuthenticated()")
public interface EmpleadoRepository extends PagingAndSortingRepository<Empleado, Integer> {
    @Query("select e from Empleado e where e.correo = :correo")
    public Optional<Empleado> findByCorreo(@Param("correo") String correo);
}
