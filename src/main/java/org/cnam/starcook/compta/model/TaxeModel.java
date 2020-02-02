package org.cnam.starcook.compta.model;

import javax.persistence.*;

@Entity
@Table(name = "facture")
public class TaxeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "typeArticle", unique = true)
    private String typeArticle;

    @Column(name = "indice")
    private float indice;

    public TaxeModel(long id, String typeArticle, float indice) {
        this.id = id;
        this.typeArticle = typeArticle;
        this.indice = indice;
    }

    public TaxeModel(String typeArticle, float indice) {
        this.typeArticle = typeArticle;
        this.indice = indice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeArticle() {
        return typeArticle;
    }

    public void setTypeArticle(String typeArticle) {
        this.typeArticle = typeArticle;
    }

    public float getIndice() {
        return indice;
    }

    public void setIndice(float indice) {
        this.indice = indice;
    }
}
