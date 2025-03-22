package edu.icet.repository.custom;

import edu.icet.model.entity.item.lens_cleaner.LensCleanerEntity;
import edu.icet.repository.SuperDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LensCleanerDao extends SuperDao, JpaRepository<LensCleanerEntity,Integer> {
}
