package com.saborurbano.restaurante.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Categoria")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    @Column(nullable = false, length = 100, unique = true)
    private String nombreCategoria;

    // Relación OneToMany: Una Categoria tiene muchos Platillos
    @OneToMany(mappedBy = "categoria")
    @JsonManagedReference("categoria-platillos")
    private Set<Platillo> platillos;

    public Categoria(String nombreCategoria, Set<Platillo> platillos) {
        this.nombreCategoria = nombreCategoria;
        this.platillos = platillos;
    }

}