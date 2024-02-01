package com.mjdraperies.yardage.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document(collection = "yardages")
public class Yardage {
	@Id
	private String id;

	private String title;

	private String description;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate startDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")

	private LocalDate finishDate;
	private Boolean completed;
	private int panelNumber;

	private int finishedLength;
	private int yardagePerWidth;

	private int widthPerPanel;

	private int totalWidth;

	private int totalYardage;

	private BigDecimal costPerYard;

	private BigDecimal fabricCost;

	private BigDecimal shopSupplyCost;

	private int liningPerYard;

	private BigDecimal liningCost;

	private BigDecimal laborCost;
	private BigDecimal totalCost;

	public Yardage(String title, String description, LocalDate startDate, LocalDate finishDate, Boolean completed, int panelNumber, int finishedLength, int yardagePerWidth, int widthPerPanel,
	               int totalWidth, int totalYardage, BigDecimal costPerYard, BigDecimal fabricCost, BigDecimal shopSupplyCost, int liningPerYard, BigDecimal liningCost, BigDecimal laborCost,
	               BigDecimal totalCost) {
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.completed = completed;
		this.panelNumber = panelNumber;
		this.finishedLength = finishedLength;
		this.yardagePerWidth = yardagePerWidth;
		this.widthPerPanel = widthPerPanel;
		this.totalWidth = totalWidth;
		this.totalYardage = totalYardage;
		this.costPerYard = costPerYard;
		this.fabricCost = fabricCost;
		this.shopSupplyCost = shopSupplyCost;
		this.liningPerYard = liningPerYard;
		this.liningCost = liningCost;
		this.laborCost = laborCost;
		this.totalCost = totalCost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public int getPanelNumber() {
		return panelNumber;
	}

	public void setPanelNumber(int panelNumber) {
		this.panelNumber = panelNumber;
	}

	public int getFinishedLength() {
		return finishedLength;
	}

	public void setFinishedLength(int finishedLength) {
		this.finishedLength = finishedLength;
	}

	public int getYardagePerWidth() {
		return yardagePerWidth;
	}

	public void setYardagePerWidth(int yardagePerWidth) {
		this.yardagePerWidth = yardagePerWidth;
	}

	public int getWidthPerPanel() {
		return widthPerPanel;
	}

	public void setWidthPerPanel(int widthPerPanel) {
		this.widthPerPanel = widthPerPanel;
	}

	public int getTotalWidth() {
		return totalWidth;
	}

	public void setTotalWidth(int totalWidth) {
		this.totalWidth = totalWidth;
	}

	public int getTotalYardage() {
		return totalYardage;
	}

	public void setTotalYardage(int totalYardage) {
		this.totalYardage = totalYardage;
	}

	public BigDecimal getCostPerYard() {
		return costPerYard;
	}

	public void setCostPerYard(BigDecimal costPerYard) {
		this.costPerYard = costPerYard;
	}

	public BigDecimal getFabricCost() {
		return fabricCost;
	}

	public void setFabricCost(BigDecimal fabricCost) {
		this.fabricCost = fabricCost;
	}

	public BigDecimal getShopSupplyCost() {
		return shopSupplyCost;
	}

	public void setShopSupplyCost(BigDecimal shopSupplyCost) {
		this.shopSupplyCost = shopSupplyCost;
	}

	public int getLiningPerYard() {
		return liningPerYard;
	}

	public void setLiningPerYard(int liningPerYard) {
		this.liningPerYard = liningPerYard;
	}

	public BigDecimal getLiningCost() {
		return liningCost;
	}

	public void setLiningCost(BigDecimal liningCost) {
		this.liningCost = liningCost;
	}

	public BigDecimal getLaborCost() {
		return laborCost;
	}

	public void setLaborCost(BigDecimal laborCost) {
		this.laborCost = laborCost;
	}

	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	public Yardage() {

	}

	@Override
	public String toString() {
		return "Yardage [" +
				"title='" + title + '\'' +
				", description='" + description + '\'' +
				", startDate=" + startDate +
				", finishDate=" + finishDate +
				", isCompleted=" + completed +
				", panelNumber=" + panelNumber +
				", finishedLength=" + finishedLength +
				", yardagePerWidth=" + yardagePerWidth +
				", widthPerPanel=" + widthPerPanel +
				", totalWidth=" + totalWidth +
				", totalYardage=" + totalYardage +
				", costPerYard=" + costPerYard +
				", fabricCost=" + fabricCost +
				", shopSupplyCost=" + shopSupplyCost +
				", liningPerYard=" + liningPerYard +
				", liningCost=" + liningCost +
				", laborCost=" + laborCost +
				']';
	}

}
