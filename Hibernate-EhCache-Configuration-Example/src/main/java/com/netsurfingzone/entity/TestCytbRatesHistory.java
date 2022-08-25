//package com.netsurfingzone.entity;
//
//import java.io.Serializable;
//
//import javax.persistence.Cacheable;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//import org.hibernate.annotations.Cache;
//import org.hibernate.annotations.CacheConcurrencyStrategy;
//
//import lombok.Data;
//
//@Data
//@Entity(name = "TEST_CYTB_RATES_HISTORY")
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "testCytbRatesHistory")
//public class TestCytbRatesHistory implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -3913833684471125056L;
//
//	private String BRANCH_CODE;
//	private String CCY1;
//	private String CCY2;
//	private String RATE_TYPE;
//	@Id
//	private String RATE_DT_STAMP;
//	private String MID_RATE;
//	private String BUY_RATE;
//	private String SALE_RATE;
//	private String RATE_SERIAL;
//	private String RATE_DATE;
//	private String COLUMN1;
//
//}
