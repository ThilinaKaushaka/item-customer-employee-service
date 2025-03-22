package edu.icet.repository.custom;

import edu.icet.model.entity.item.contact_lens.ContactLensEntity;
import edu.icet.repository.SuperDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactLensDao extends SuperDao, JpaRepository<ContactLensEntity,Integer> {
}
