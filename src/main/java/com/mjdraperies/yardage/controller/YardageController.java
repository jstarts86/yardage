package com.mjdraperies.yardage.controller;

import com.mjdraperies.yardage.model.Yardage;
import com.mjdraperies.yardage.repository.YardageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class YardageController {

	@Autowired
	YardageRepository yardageRepository;

	@GetMapping("/yardages")
	public ResponseEntity<List<Yardage>> getAllYardages(@RequestParam(required = false) String title) {
		try {
			List<Yardage> yardages = new ArrayList<Yardage>();

			if (title == null)
				yardageRepository.findAll().forEach(yardages::add);
			else
				yardageRepository.findByTitleContaining(title).forEach(yardages::add);
			if(yardages.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(yardages, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/yardages/{id}")
	public ResponseEntity<Yardage> getYardageById(@PathVariable("id") String id) {
		Optional<Yardage> yardageData = yardageRepository.findById(id);

		if(yardageData.isPresent()) {
			return new ResponseEntity<>(yardageData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/yardages")
	public ResponseEntity<Yardage> createYardage(@RequestBody Yardage yardage) {
		try {
			Yardage _yardage = yardageRepository
					.save(new Yardage(
							yardage.getTitle(),
							yardage.getDescription(),
							yardage.getStartDate(),
							yardage.getFinishDate(),
							yardage.getCompleted(),
							yardage.getPanelNumber(),
							yardage.getFinishedLength(),
							yardage.getYardagePerWidth(),
							yardage.getWidthPerPanel(),
							yardage.getTotalWidth(),
							yardage.getTotalYardage(),
							yardage.getCostPerYard(),
							yardage.getFabricCost(),
							yardage.getShopSupplyCost(),
							yardage.getLiningPerYard(),
							yardage.getLiningCost(),
							yardage.getLaborCost(),
							yardage.getTotalCost()
					));
			return new ResponseEntity<>(_yardage, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/yardages/{id}")
	public ResponseEntity<Yardage> updateYardage(@PathVariable("id") String id, @RequestBody Yardage yardage) {
		Optional<Yardage> yardageData = yardageRepository.findById(id);

		if(yardageData.isPresent()) {
			Yardage _yardage = yardageData.get();
			_yardage.setTitle(yardage.getTitle());
			_yardage.setDescription(yardage.getDescription());
			_yardage.setStartDate(yardage.getStartDate());
			_yardage.setFinishDate(yardage.getFinishDate());
			_yardage.setCompleted(yardage.getCompleted());
			_yardage.setPanelNumber(yardage.getPanelNumber());
			_yardage.setFinishedLength(yardage.getFinishedLength());
			_yardage.setYardagePerWidth(yardage.getYardagePerWidth());
			_yardage.setWidthPerPanel(yardage.getWidthPerPanel());
			_yardage.setTotalWidth(yardage.getTotalWidth());
			_yardage.setTotalYardage(yardage.getTotalYardage());
			_yardage.setCostPerYard(yardage.getCostPerYard());
			_yardage.setFabricCost(yardage.getFabricCost());
			_yardage.setShopSupplyCost(yardage.getShopSupplyCost());
			_yardage.setLiningPerYard(yardage.getLiningPerYard());
			_yardage.setLiningCost(yardage.getLiningCost());
			_yardage.setLaborCost(yardage.getLaborCost());
			_yardage.setTotalCost(yardage.getTotalCost());
			return new ResponseEntity<>(yardageRepository.save(_yardage), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping("/yardages/{id}")
	public ResponseEntity<HttpStatus> deleteYardage(@PathVariable("id") String id) {
		try {
			yardageRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@DeleteMapping("/yardages")
	public ResponseEntity<HttpStatus> deleteAllYardages() {
		try {
			yardageRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/yardages/completed")
	public ResponseEntity<List<Yardage>> findByCompleted() {
		try {
			List<Yardage> yardages = yardageRepository.findByIsCompleted(true);
			if(yardages.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(yardages, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
