package com.sgy.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class RedPacket implements Serializable {
	private static final long serialVersionUID = 1049397724701962381L;
	
	private Long id;
	private Long userid;
	private Double amount;
	private Timestamp sendDate ;
	private Integer total ;
	private Double unitAmount ;
	private Integer stock ;
	private Integer version ;
	private String note;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Timestamp getSendDate() {
		return sendDate;
	}
	public void setSendDate(Timestamp sendDate) {
		this.sendDate = sendDate;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Double getUnitAmount() {
		return unitAmount;
	}
	public void setUnitAmount(Double unitAmount) {
		this.unitAmount = unitAmount;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
}
