package org.cnam.starcook.compta.domain;

public class Facture {
    public long id;
    public String article;
    public String typeArticle;
    public String coordonnesCreancier;
    public float montant;

    public Facture(long id, String article, String typeArticle, String coordonnesCreancier, float montant) {
        this.id = id;
        this.article = article;
        this.typeArticle = typeArticle;
        this.coordonnesCreancier = coordonnesCreancier;
        this.montant = montant;
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

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }
}
