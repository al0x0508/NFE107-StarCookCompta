package org.cnam.starcook.compta.controller;

import org.cnam.starcook.compta.domain.Taxe;
import org.cnam.starcook.compta.dto.TaxeGetResponse;
import org.cnam.starcook.compta.service.TaxeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxe")
public class TaxeController {

    @Autowired
    private TaxeService taxeService;

    @GetMapping("/get/{typeArticle}")
    public TaxeGetResponse getTaxe(@PathVariable("typeArticle") String typeArticle) {
        Taxe taxe = taxeService.getTaxeByTypeArticle(typeArticle);

        return new TaxeGetResponse(taxe.typeArticle, taxe.indice);
    }

}
