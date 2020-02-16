package org.cnam.starcook.compta.service;

import org.cnam.starcook.compta.domain.Facture;
import org.cnam.starcook.compta.model.FactureModel;
import org.cnam.starcook.compta.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactureService {
    @Autowired
    private FactureRepository factureRepository;

    public Facture createNewFacture(String article, String typeArticle, String coordonnesCreancier, float montant) {
        FactureModel factureModelToCreate = new FactureModel(article, typeArticle, coordonnesCreancier, montant);
        FactureModel factureModelSaved = factureRepository.save(factureModelToCreate);

        return new Facture(factureModelSaved.getId(), factureModelSaved.getArticle(), factureModelSaved.getTypeArticle(), factureModelSaved.getCoordonnesCreancier(), factureModelSaved.getMontant());
    }

    public Facture getFactureById(long id) {
        FactureModel factureModelToGet = factureRepository.findOne(id);

        return new Facture(factureModelToGet.getId(), factureModelToGet.getArticle(), factureModelToGet.getTypeArticle(), factureModelToGet.getCoordonnesCreancier(), factureModelToGet.getMontant());
    }
}
