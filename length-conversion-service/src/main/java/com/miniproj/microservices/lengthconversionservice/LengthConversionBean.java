package com.miniproj.microservices.lengthconversionservice;
import java.math.BigDecimal;

public class LengthConversionBean {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversion_multiple;
	private BigDecimal quantity;
	private BigDecimal calculated_length;
	public LengthConversionBean(Long id, String from, String to, BigDecimal conversion_multiple, BigDecimal quantity,
			BigDecimal calculated_length) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion_multiple = conversion_multiple;
		this.quantity = quantity;
		this.calculated_length = calculated_length;
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
	public BigDecimal getConversion_Multiple() {
		return conversion_multiple;
	}
	public void setConversion_Multiple(BigDecimal conversion_Multiple) {
		this.conversion_multiple = conversion_Multiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getCalculated_length() {
		return calculated_length;
	}
	public void setCalculated_length(BigDecimal calculated_length) {
		this.calculated_length = calculated_length;
	}

}
