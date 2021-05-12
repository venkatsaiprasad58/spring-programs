package com.ojas.emp.Springcoreproj.model;

import java.util.*;

public class EmployeeCollections {
	
	private List<String> empList;
	private Set<String> empSet;
	private Map<String, String> empMap;
	private Properties empProperties;
	

	public List<String> getEmpList() {
		return empList;
	}

	public void setEmpList(List<String> empList) {
		this.empList = empList;
	}

	public Set<String> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(Set<String> empSet) {
		this.empSet = empSet;
	}

	public Map<String, String> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<String, String> empMap) {
		this.empMap = empMap;
	}

	public Properties getEmpProperties() {
		return empProperties;
	}

	public void setEmpProperties(Properties empProperties) {
		this.empProperties = empProperties;
	}

	@Override
	public String toString() {
		return "EmployeeCollections [empList=" + empList + ", empSet=" + empSet + ", empMap=" + empMap
				+ ", empProperties=" + empProperties + "]";
	}
	
	
	
		
	
}
