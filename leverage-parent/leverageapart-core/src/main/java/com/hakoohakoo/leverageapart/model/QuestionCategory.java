package com.hakoohakoo.leverageapart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class QuestionCategory {
	@Id private int id;
	private String name;
}
