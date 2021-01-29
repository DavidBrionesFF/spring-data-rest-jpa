package com.bytecode.rest.repository;

import com.bytecode.rest.entity.Bitacora;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository("bitacora")
@CrossOrigin(value = {})
@PreAuthorize("isAuthenticated()")
@RepositoryRestResource(path = "bitacora")
public interface BitacoraRepository extends PagingAndSortingRepository<Bitacora, Integer> {

}
