package org.cnam.starcook.compta.dto;

public class FactureCreateRequest {
    public String article;
    public String typeArticle;
    public String coordonnesCreancier;
    public float solde;


    public FactureCreateRequest(String article, String typeArticle, String coordonnesCreancier, float solde) {
        this.article = article;
        this.typeArticle = typeArticle;
        this.coordonnesCreancier = coordonnesCreancier;
        this.solde = solde;
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
