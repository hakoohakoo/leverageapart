package com.hakoohakoo.leverageapart.core.rawdata;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Kapt {
	@JsonProperty("kaptda_cnt")
	private int houseCount; //μΈλμ
}
