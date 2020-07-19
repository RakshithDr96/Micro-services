package com.miniproj.microservices.lengthmultipleservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LENGTH_MULTIPLE")
public class LengthMultiple {
	
	@Id
	private Long id;
	@Column(name="convert_from")
	private String from;
	@Column(name="convert_to")
	private String to;
	@Column(name="conversion_multiple")
	private BigDecimal conversion_multiple;
	
	public LengthMultiple() 
	{
		
	}
	public LengthMultiple(Long id, String from, String to, BigDecimal quantity) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion_multiple = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getconversion_multiple() {
		return conversion_multiple;
	}
	public void setconversion_multiple(BigDecimal quantity) {
		this.conversion_multiple = quantity;
	}
}
