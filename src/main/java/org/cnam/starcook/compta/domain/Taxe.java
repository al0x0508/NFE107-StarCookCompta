package org.cnam.starcook.compta.domain;

public class Taxe {
    public String typeArticle;
    public float indice;

    public Taxe(String typeArticle, float indice) {
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
}
