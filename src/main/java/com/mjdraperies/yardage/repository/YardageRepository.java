package com.mjdraperies.yardage.repository;

import com.mjdraperies.yardage.model.Yardage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface YardageRepository extends JpaRepository<Yardage, Long> {
	List<Yardage> findByTitleContaining(String title);
}
