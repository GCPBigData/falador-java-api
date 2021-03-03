package br.falador.controller;

import br.falador.repository.PessoaRepository;
import br.falador.repository.PutasRepository;
import br.falador.services.PessoaService;
import br.falador.services.PutasService;
import com.googolplex.documents.Pessoa;
import com.googolplex.documents.Putas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("putas")
@RestController
public class PutasController {

    @Autowired
    PutasService putasService;

    @Autowired
    PutasRepository putasRepository;

    //http://localhost:8080/putas/todasPutas
    @GetMapping(value = "/todasPutas") //RETORNAR TODAS AS PUTAS, UMA LISTA DE PUTA
    public Flux<Putas> getAll() {
        return putasRepository.findAll();
    }

    //PARAMETRO IN ENTRADA
    //http://localhost:8080/putas/buscaNomePuta/maria
    @GetMapping("/buscaNomePuta/{nome}") //JSON
    public Flux<ResponseEntity<Putas>> getByNome(@PathVariable String nome) {
        return putasRepository.findByNome(nome)
                .map(ResponseEntity::ok) // retorna um mapa de puta
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

}


