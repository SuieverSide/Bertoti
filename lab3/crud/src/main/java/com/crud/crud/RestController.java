package com.crud.crud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/locais")
public class RestController {

    private final List<Locais> listLocais = new ArrayList<>();
    @GetMapping("/Lucas")
    Iterable<Locais> getLocais(){
        return listLocais;
    }
    @PostMapping
    ResponseEntity getLocais(@RequestBody Locais locais){


        listLocais.add(locais);
        return ResponseEntity.status(HttpStatus.OK).body("Adicionado com sucesso");
    }
    @DeleteMapping
    ResponseEntity removeLocais(@RequestBody Locais locais){

        
        return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
    }

}
