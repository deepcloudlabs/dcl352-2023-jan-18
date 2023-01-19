package com.example.sc.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//{"identity":{"value":"84166588398"}}
@Getter
@Setter
@ToString
public class HrEvent {
	private String id;
	private LocalDateTime timestamp;
	private String identityNo;
	
}
