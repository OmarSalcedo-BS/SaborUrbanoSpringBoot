package com.saborurbano.restaurante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.saborurbano.restaurante.model.Usuarios;
import com.saborurbano.restaurante.repository.UsuariosRepository;
import com.saborurbano.restaurante.service.Usuario.UsuarioServiceImp;


@SpringBootApplication
public class RestauranteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestauranteApplication.class, args);
	}

}
