package com.example.hr.domain;

import com.example.ddd.DomainEntity;

// Ubiquitous language: Employee, TcKimlikNo, FullName, Photo, JobStyle
// Entity Class: i. identity, ii. Mutable
@DomainEntity(identity= "identityNo",aggregate=true)
public class Employee {
	private final TcKimlikNo identityNo;
	private FullName fullname;
	private Money salary;
	private Iban iban;
	private final BirthYear birthYear;
	private Photo photo;
	private Department department;
	private JobStyle jobStyle;
	
}
