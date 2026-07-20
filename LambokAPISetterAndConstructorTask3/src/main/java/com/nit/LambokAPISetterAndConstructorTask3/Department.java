package com.nit.LambokAPISetterAndConstructorTask3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Department 
{
	private int departmentId;
	private String departmentName;
	private String departmentLocation;
}
