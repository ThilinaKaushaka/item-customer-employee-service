package edu.icet.repository.custom;

import edu.icet.model.entity.item.contact_liquid.ContactLiquidEntity;
import edu.icet.repository.SuperDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactLiquidDao extends SuperDao, JpaRepository<ContactLiquidEntity,Integer> {
}
