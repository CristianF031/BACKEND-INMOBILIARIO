package co.edu.usbcali.inmobiliaria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contratos_arrendamiento")
public class ContratoArrendamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrato_arrendamiento")
    private Integer idContratoArrendamiento;

    @Column(name = "Fecha_Inicio", nullable = false)
    private LocalDateTime fechaInicio;

    @Column(name = "Fecha_Fin", nullable = false)
    private LocalDateTime fechaFin;

    @Column(name = "renta_Mensual", precision = 10, scale = 2)
    private Double rentaMensual;

    @Column(name = "deposito", precision = 10, scale = 2)
    private Double deposito;




    //HACER LLAVES FORANEAS PARA LA PROXIMA CLASE

    @ManyToOne
    @JoinColumn(name = "id_estado_contrato", referencedColumnName = "id_estado_contrato", nullable = false)
    private EstadoContrato estadoContrato;

    @ManyToOne
    @JoinColumn(name = "id_propiedad", referencedColumnName = "id_propiedad", nullable = false)
    private Propiedad propiedad;

    @ManyToOne
    @JoinColumn(name = "id_arrendatario", referencedColumnName = "id_persona", nullable = false)
    private Persona arrendatario;

    @ManyToOne
    @JoinColumn(name = "id_asesor", referencedColumnName = "id_persona", nullable = false)
    private Persona asesor;
}
