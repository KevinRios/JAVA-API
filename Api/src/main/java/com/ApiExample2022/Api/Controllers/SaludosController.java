package com.ApiExample2022.Api.Controllers;

import java.lang.String;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludos")
public class SaludosController {

    //Primer endpoint  GET
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        String mensaje = "Hola! Mi nombre es Kevin Rios y esta es mi primera API";
        return ResponseEntity.ok(mensaje);
    }

    // Segundo endpoint POST
    @PostMapping("/goodbye")
    public ResponseEntity<String> goodbye(){
        String mensaje = "Hasta luego!";
        return ResponseEntity.ok(mensaje);
    }



}
