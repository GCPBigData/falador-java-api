package com.googolplex.documents;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 01/04/2021
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Data
@Document(collection = "putas")
public class Putas {

    @Id
    public String id; // texto
    public String nome; // texto
    public String buceta; // texto
    public String cu; // texto
    public Double preco; //numero

}
