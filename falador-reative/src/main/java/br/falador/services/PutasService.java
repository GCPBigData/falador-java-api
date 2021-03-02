package br.falador.services;

import com.googolplex.documents.Putas;
import reactor.core.publisher.Flux;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

public interface PutasService {

    Flux<Putas> buscaTodasPutas(); // ASSINATURA DO METODO BUSTA TODAS PUTAS

}
