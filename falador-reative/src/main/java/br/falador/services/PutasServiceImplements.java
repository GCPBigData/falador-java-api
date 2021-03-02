package br.falador.services;

import br.falador.repository.PutasRepository;
import com.googolplex.documents.Putas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

@Service
public class PutasServiceImplements implements PutasService {

    @Autowired
    PutasRepository putasRepository;


    @Override
    public Flux<Putas> buscaTodasPutas() {
        return putasRepository.findAll();
    }
}
