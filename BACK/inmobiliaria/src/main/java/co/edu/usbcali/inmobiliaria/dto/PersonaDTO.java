package co.edu.usbcali.inmobiliaria.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDTO {
    private Integer idPersona;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String direccion;
    private String ciudad;
    private Integer codigo_postal;
}
