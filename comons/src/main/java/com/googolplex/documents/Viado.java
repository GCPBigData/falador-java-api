package com.googolplex.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 01/04/2021
 */

@Data
@Document(collection = "viado")
public class Viado {

    @Id
    String nome;
    String piroca;
    String cu;
    Double preco; //2.0
    Double altura; //1.70
    Integer idade; //22 / 20 /525


}
