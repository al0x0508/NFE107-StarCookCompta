package org.cnam.starcook.compta.repository;

import org.cnam.starcook.compta.model.FactureModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<FactureModel, Long> {
}
