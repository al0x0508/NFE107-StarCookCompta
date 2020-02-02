package org.cnam.starcook.compta.repository;

import org.cnam.starcook.compta.domain.Taxe;
import org.cnam.starcook.compta.model.TaxeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.NamedQuery;
import java.util.List;

public interface TaxeRepository extends JpaRepository<TaxeModel, Long> {
    @Query("SELECT t FROM Taxe t WHERE LOWER(t.typeArticle) = LOWER(:typeArticle)")
    TaxeModel findByTypeArticle(String typeArticle);
}
