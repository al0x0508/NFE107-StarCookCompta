package org.cnam.starcook.compta.controller;

import org.cnam.starcook.compta.domain.Facture;
import org.cnam.starcook.compta.dto.FactureCreateRequest;
import org.cnam.starcook.compta.dto.FactureCreateResponse;
import org.cnam.starcook.compta.dto.FactureGetResponse;
import org.cnam.starcook.compta.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facture")
public class FactureController {

    @Autowired
    private FactureService factureService;

    @GetMapping("/get/{id}")
    public FactureGetResponse getFacture(@PathVariable("id") long id) {
        Facture facture = factureService.getFactureById(id);

        return new FactureGetResponse(facture.id, facture.article, facture.typeArticle, facture.coordonnesCreancier, facture.montant);
    }

    @GetMapping("/create")
    @ResponseBody
    public FactureCreateResponse createNewFacture(@RequestBody FactureCreateRequest factureCreateRequest) {
        Facture facture = factureService.createNewFacture(factureCreateRequest.getArticle(), factureCreateRequest.getTypeArticle(), factureCreateRequest.getCoordonnesCreancier(), factureCreateRequest.getSolde());

        return new FactureCreateResponse(facture.id, facture.article, facture.typeArticle, facture.coordonnesCreancier, facture.montant);
    }
}
