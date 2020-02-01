package org.cnam.starcook.compta.dto;

public class FactureCreateResponse {
    public long id;
    public String article;
    public String typeArticle;
    public String coordonnesCreancier;
    public float solde;

    public FactureCreateResponse(long id, String article, String typeArticle, String coordonnesCreancier, float solde) {
        this.id = id;
        this.article = article;
        this.typeArticle = typeArticle;
        this.coordonnesCreancier = coordonnesCreancier;
        this.solde = solde;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getTypeArticle() {
        return typeArticle;
    }

    public void setTypeArticle(String typeArticle) {
        this.typeArticle = typeArticle;
    }

    public String getCoordonnesCreancier() {
        return coordonnesCreancier;
    }

    public void setCoordonnesCreancier(String coordonnesCreancier) {
        this.coordonnesCreancier = coordonnesCreancier;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }
}
