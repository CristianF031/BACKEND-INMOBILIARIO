package co.edu.usbcali.inmobiliaria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estados_contrato")
public class EstadoContrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer idPersona;

    @Column (name ="nombre", nullable = false, length = 100)
    private String nombre;

    @Column (name ="idEstadoContrato", nullable = false, length = 100)
    private String idEstadoContrato;

    @Column (name ="descripcion", nullable = false, length = 100)
    private String descripcion;

    }

