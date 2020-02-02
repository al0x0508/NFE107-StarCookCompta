package org.cnam.starcook.compta.service;

import org.cnam.starcook.compta.domain.Taxe;
import org.cnam.starcook.compta.model.TaxeModel;
import org.cnam.starcook.compta.repository.TaxeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxeService {
    private TaxeRepository taxeRepository;

    @Autowired
    public Taxe taxe;

    public Taxe createNewTaxe(String typeArticle, float indice) {
        TaxeModel taxeModelToCreate = new TaxeModel(typeArticle, indice);
        TaxeModel taxeModelSaved = taxeRepository.save(taxeModelToCreate);

        return new Taxe(taxeModelSaved.getId(), taxeModelSaved.getTypeArticle(), taxeModelSaved.getIndice());
    }

    public Taxe getTaxeByTypeArticle(String typeArticle) {
        TaxeModel taxeModelToGet = taxeRepository.findByTypeArticle(typeArticle);

        return new Taxe(taxeModelToGet.getId(), taxeModelToGet.getTypeArticle(), taxeModelToGet.getIndice());
    }
}
