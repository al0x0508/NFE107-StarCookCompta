package org.cnam.starcook.compta.dto;

public class TaxeGetRequest {
    public String typeArticle;

    public TaxeGetRequest(String typeArticle) {
        this.typeArticle = typeArticle;
    }

    public String getTypeArticle() {
        return typeArticle;
    }

    public void setTypeArticle(String typeArticle) {
        this.typeArticle = typeArticle;
    }
}
