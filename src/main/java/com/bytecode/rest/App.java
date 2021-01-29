package com.bytecode.rest;

import com.bytecode.rest.entity.Empleado;
import com.bytecode.rest.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@SpringBootApplication
public class App implements CommandLineRunner {
	@Autowired
	private EmpleadoRepository empleadoRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Empleado empleado = empleadoRepository.findByCorreo("aprendefacil1020@gmail.com").get();
//		empleado.setContrasena(bCryptPasswordEncoder.encode("1234"));
//		empleadoRepository.save(empleado);
	}
}
