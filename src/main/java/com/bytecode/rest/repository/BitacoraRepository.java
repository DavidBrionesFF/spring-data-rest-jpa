package com.bytecode.rest.repository;

import com.bytecode.rest.entity.Bitacora;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;

@Repository("bitacora")
@CrossOrigin(value = {})
@RepositoryRestResource(path = "bitacora")
public interface BitacoraRepository extends PagingAndSortingRepository<Bitacora, Integer> {
}
