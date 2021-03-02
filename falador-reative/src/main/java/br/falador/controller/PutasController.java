package br.falador.controller;

import br.falador.repository.PessoaRepository;
import br.falador.services.PessoaService;
import com.googolplex.documents.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    /*

    @Autowired
    PessoaService pessoaService;

    @Autowired
    PessoaRepository pessoaRepository;

    @GetMapping(value = "/todos")
    public Flux<Pessoa> getAll() {
        return pessoaService.findAll();
    }

     */

}
