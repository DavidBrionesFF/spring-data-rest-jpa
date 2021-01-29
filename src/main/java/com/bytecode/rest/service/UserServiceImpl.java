package com.bytecode.rest.service;

import com.bytecode.rest.entity.Empleado;
import com.bytecode.rest.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserDetailsService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        Optional<Empleado> empleadoOptional = empleadoRepository.findByCorreo(correo);

        if (empleadoOptional.isPresent()){
            Empleado empleado = empleadoOptional.get();

            List<SimpleGrantedAuthority> authorities = empleado.getRoles()
                                                                .stream()
                                                                .map(rol -> {
                                                                    return new SimpleGrantedAuthority(rol.getNombre());
                                                                })
                                                                .collect(Collectors.toList());

            return new User(empleado.getCorreo(), empleado.getContrasena(), authorities);
        }

        throw new UsernameNotFoundException("El usuario no existe");
    }
}
