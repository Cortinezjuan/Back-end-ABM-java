package com.instrumento.app.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Instrumento {
    @Id

    private int id;
    private String instrumento;
    private String marca;
    private String modelo;
    private String imagen;
    private double precio;
    private String costo_Envio;
    private int cantidad_Vendida;
    private String descripcion;
}
