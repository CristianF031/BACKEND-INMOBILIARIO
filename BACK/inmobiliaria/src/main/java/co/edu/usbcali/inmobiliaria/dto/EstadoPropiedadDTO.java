package co.edu.usbcali.inmobiliaria.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstadoPropiedadDTO {
    private String nombre;
    private String descripcion;
}