package com.mjdraperies.yardage.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name= "YARDAGE")
public class Yardage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;
	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "finish_date")
	private Date finishDate;
	@Column(name = "is_completed")
	private Boolean isCompleted;
	@Column(name = "panels")
	private int panelNumber;

	@Column(name = "finished_length")
	private int finishedLength;

	@Column(name = "yardage_per_width")
	private int yardagePerWidth;

	@Column(name = "width_per_panel")
	private int widthPerPanel;

	@Column(name = "total_width")
	private int totalWidth;

	@Column(name = "total_yardage")
	private int totalYardage;

	@Column(name = "cost_per_yard")
	private BigDecimal costPerYard;

	@Column(name = "fabric_cost")
	private BigDecimal fabricCost;

	@Column(name = "shop_supply_cost")
	private BigDecimal shopSupplyCost;

	@Column(name = "lining_per_yard")
	private int liningPerYard;

	@Column(name = "lining_cost")
	private BigDecimal liningCost;

	@Column(name = "labor_cost")
	private BigDecimal laborCost;

	public Yardage(String title, String description, Date startDate, Date finishDate, Boolean isCompleted, int panelNumber, int finishedLength, int yardagePerWidth, int widthPerPanel, int totalWidth, int totalYardage, BigDecimal costPerYard, BigDecimal fabricCost, BigDecimal shopSupplyCost, int liningPerYard, BigDecimal liningCost, BigDecimal laborCost) {
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
	}

	public Yardage() {
	}

	public long getId() {
		return id;
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
		return "Yardage{" +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", startDate=" + startDate +
				", finishDate=" + finishDate +
				", isCompleted="  + isCompleted +
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
				'}';
	}

}
