package edu.icet.repository.custom;

import edu.icet.model.entity.item.lens.LensEntity;
import edu.icet.repository.SuperDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LensDao extends SuperDao, JpaRepository<LensEntity,Integer> {
}
