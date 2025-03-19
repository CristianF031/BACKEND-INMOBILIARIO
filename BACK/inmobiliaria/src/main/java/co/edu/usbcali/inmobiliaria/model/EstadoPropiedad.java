package co.edu.usbcali.inmobiliaria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estados_propiedad")

public class EstadoPropiedad {

    @Column(name ="nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name ="descripcion", nullable = false, length = 100)
    private String descripcion;

    @Column(name ="idEstadoPropiedad", nullable = false, length = 100)
    private String idEstadoPropiedad;


    }

