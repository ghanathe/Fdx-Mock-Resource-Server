package com.mastercard.fdx.mock.transaction.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mastercard.fdx.mock.dto.ErrorPojo;
import com.mastercard.fdx.mock.dto.Links;
import com.mastercard.fdx.mock.dto.Page;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transactions extends ErrorPojo{

	private Page page;
	private Links links;
	private List<TransactionsDetails> transactions;
	public Transactions() {
		super();
	}
	public Transactions(Integer errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}
	
	
}
