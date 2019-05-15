package com.sgy.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserRedPacket implements Serializable {
	private static final long serialVersionUID = -5617482065991830143L ;
	private Long id;
	private Long redPacketid;
	private Long userid;
	private Double amount ;
	private Timestamp grabTime;
	private String note;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRedPacketid() {
		return redPacketid;
	}
	public void setRedPacketid(Long redPacketid) {
		this.redPacketid = redPacketid;
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
	public Timestamp getGrabTime() {
		return grabTime;
	}
	public void setGrabTime(Timestamp grabTime) {
		this.grabTime = grabTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
