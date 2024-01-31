package com.mjdraperies.yardage.repository;

import com.mjdraperies.yardage.model.Yardage;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface YardageRepository extends MongoRepository<Yardage, Long> {
	List<Yardage> findByTitleContaining(String title);
	List<Yardage> findByIsCompleted(boolean isCompleted);
}
