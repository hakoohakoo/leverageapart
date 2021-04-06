package com.hakoohakoo.leverageapart.rawdata;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Kapt {
	@JsonProperty("kaptda_cnt")
	private int houseCount; //세대수
}
