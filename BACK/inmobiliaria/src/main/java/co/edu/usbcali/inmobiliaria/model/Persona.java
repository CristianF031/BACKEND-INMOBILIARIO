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
@Table(name = "personas")
public class Persona {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_persona")
        private Integer idPersona;

    @Column (name ="nombre", nullable = false, length = 100)
        private String nombre;

    @Column (name ="apellido", nullable = false, length = 100)
    private String apellido;

    @Column (name ="telefono", nullable = false, length = 15)
    private String telefeno;

    @Column (name ="email", nullable = false, length = 100)
    private String email;

    @Column (name ="direccion", nullable = false, length = 200)
    private String direccion;

    @Column (name ="ciudad", nullable = false, length = 100)
    private String ciudad;

    @Column (name ="codigopostal", nullable = false, length = 50)
    private String codigopostal;

}


