package org.cnam.starcook.compta.domain;

public class Taxe {
    public long id;
    public String typeArticle;
    public float indice;

    public Taxe(long id, String typeArticle, float indice) {
        this.id = id;
        this.typeArticle = typeArticle;
        this.indice = indice;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
