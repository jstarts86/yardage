package com.mjdraperies.yardage.model;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "yardages")
public class Yardage {
	@Id
	private String id;

	private String title;

	private String description;
	private Date startDate;

	private Date finishDate;
	private Boolean isCompleted;
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

	public Yardage(String title, String description, Date startDate, Date finishDate, Boolean isCompleted, int panelNumber, int finishedLength, int yardagePerWidth, int widthPerPanel, int totalWidth, int totalYardage, BigDecimal costPerYard, BigDecimal fabricCost, BigDecimal shopSupplyCost, int liningPerYard, BigDecimal liningCost, BigDecimal laborCost, BigDecimal totalCost) {
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.isCompleted = isCompleted;
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

	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	public Yardage() {
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

	public String getDescription() {
		return description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public Boolean getCompleted() {
		return isCompleted;
	}

	public void setCompleted(Boolean completed) {
		isCompleted = completed;
	}

	public int getPanelNumber() {
		return panelNumber;
	}

	public int getFinishedLength() {
		return finishedLength;
	}

	public int getYardagePerWidth() {
		return yardagePerWidth;
	}

	public int getWidthPerPanel() {
		return widthPerPanel;
	}

	public int getTotalWidth() {
		return totalWidth;
	}

	public int getTotalYardage() {
		return totalYardage;
	}

	public BigDecimal getCostPerYard() {
		return costPerYard;
	}

	public BigDecimal getFabricCost() {
		return fabricCost;
	}

	public BigDecimal getShopSupplyCost() {
		return shopSupplyCost;
	}

	public int getLiningPerYard() {
		return liningPerYard;
	}

	public BigDecimal getLiningCost() {
		return liningCost;
	}

	public BigDecimal getLaborCost() {
		return laborCost;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public void setPanelNumber(int panelNumber) {
		this.panelNumber = panelNumber;
	}

	public void setFinishedLength(int finishedLength) {
		this.finishedLength = finishedLength;
	}

	public void setYardagePerWidth(int yardagePerWidth) {
		this.yardagePerWidth = yardagePerWidth;
	}

	public void setWidthPerPanel(int widthPerPanel) {
		this.widthPerPanel = widthPerPanel;
	}

	public void setTotalWidth(int totalWidth) {
		this.totalWidth = totalWidth;
	}

	public void setTotalYardage(int totalYardage) {
		this.totalYardage = totalYardage;
	}

	public void setCostPerYard(BigDecimal costPerYard) {
		this.costPerYard = costPerYard;
	}

	public void setFabricCost(BigDecimal fabricCost) {
		this.fabricCost = fabricCost;
	}

	public void setShopSupplyCost(BigDecimal shopSupplyCost) {
		this.shopSupplyCost = shopSupplyCost;
	}

	public void setLiningPerYard(int liningPerYard) {
		this.liningPerYard = liningPerYard;
	}

	public void setLiningCost(BigDecimal liningCost) {
		this.liningCost = liningCost;
	}

	public void setLaborCost(BigDecimal laborCost) {
		this.laborCost = laborCost;
	}

	@Override
	public String toString() {
		return "Yardage [" +
				"title='" + title + '\'' +
				", description='" + description + '\'' +
				", startDate=" + startDate +
				", finishDate=" + finishDate +
				", isCompleted=" + isCompleted +
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
