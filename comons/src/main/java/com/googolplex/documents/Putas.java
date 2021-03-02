package com.googolplex.documents;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 01/04/2021
 */

@Data
@Document(collection = "putas")
public class Putas {

    @Id
    public String id; // texto
    private String buceta; // texto
    public String cu; // texto
    public Double preco; //numero

    public Putas() { //instanciar e CRIAR.
    }

    public Putas(String id, String buceta, String cu, Double preco) {
        this.id = id;
        this.buceta = buceta;
        this.cu = cu;
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public String getBuceta() {
        return buceta;
    }

    public String getCu() {
        return cu;
    }

    public Double getPreco() {
        return preco;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBuceta(String buceta) {
        this.buceta = buceta;
    }

    public void setCu(String cu) {
        this.cu = cu;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
