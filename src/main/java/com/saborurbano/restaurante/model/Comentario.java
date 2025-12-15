package com.saborurbano.restaurante.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Comentario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;

    @Column(columnDefinition = "TEXT")
    private String textoComentario;

    private LocalDateTime fechaPublicacion;

    // Relación ManyToOne con Usuario (FK: id_usuario)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    @JsonBackReference("usuario-comentarios")
    private Usuarios usuario;

    // Relación OneToMany: Un Comentario puede tener muchas Reacciones
    @OneToMany(mappedBy = "comentario")
    @JsonManagedReference("comentario-reacciones")
    private Set<ReaccionComentario> reacciones;

    public Comentario(String textoComentario, LocalDateTime fechaPublicacion, Usuarios usuario) {
        this.textoComentario = textoComentario;
        this.fechaPublicacion = fechaPublicacion;
        this.usuario = usuario;
    }

}