package com.bytecode.rest.repository;

import com.bytecode.rest.entity.Empleado;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;

@Repository("empleado")
@CrossOrigin(value = {})
@RepositoryRestResource(path = "empleado")
public interface EmpleadoRepository extends PagingAndSortingRepository<Empleado, Integer> {

}
