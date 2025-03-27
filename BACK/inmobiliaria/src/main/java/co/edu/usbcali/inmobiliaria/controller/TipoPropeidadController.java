package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;
import co.edu.usbcali.inmobiliaria.repository.TipoPropiedadRepository;
import co.edu.usbcali.inmobiliaria.service.TipoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("_tipo-propiedad")
@RequiredArgsConstructor
public class TipoPropeidadController {

    //Inyección de dependencias del servicio en el controlador
    private final TipoPropiedadRepository tipoPropiedadRepository;
    private final TipoPropiedadService tipoPropiedadService;

@GetMapping("/todos")
    public List<TipoPropiedad> buscarTodos() {
        return tipoPropiedadService.getAllTiposPropiedad();


    }
}
