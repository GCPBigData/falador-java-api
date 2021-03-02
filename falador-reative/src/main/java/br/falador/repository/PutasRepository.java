package br.falador.repository;

import com.googolplex.documents.Putas;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 03/08/2020
 */

public interface PutasRepository extends ReactiveMongoRepository<Putas, String>{

}
