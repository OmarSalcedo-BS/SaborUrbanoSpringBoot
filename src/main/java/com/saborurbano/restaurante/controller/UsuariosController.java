package com.saborurbano.restaurante.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saborurbano.restaurante.model.Usuarios;
import com.saborurbano.restaurante.service.Usuario.UsuarioServiceImp;


@RequestMapping("api/usuarios")
@RestController
public class UsuariosController {

    private final UsuarioServiceImp usuarioServiceImp;

    public UsuariosController (UsuarioServiceImp usuarioServiceImp) {
        this.usuarioServiceImp = usuarioServiceImp;

    }

    @GetMapping
    public List<Usuarios> getAllUsuarios() {
        return usuarioServiceImp.getAllUsuarios();
    }

    @PostMapping
    public ResponseEntity<Usuarios> createUsuario(@RequestBody Usuarios usuarios) {
        Usuarios  nuevoUsuario = usuarioServiceImp.registrarUsuarios(usuarios);
        return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuarios(@PathVariable Integer id, Usuarios usuarios) {
        usuarioServiceImp.deleteUsuarios(id, usuarios);
        return ResponseEntity.noContent().build();
    }

    
}
