package org.cnam.starcook.compta.dto;

public class TaxeGetResponse {
    public String typeArticle;
    public float indice;

    public TaxeGetResponse(String typeArticle, float indice) {
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
