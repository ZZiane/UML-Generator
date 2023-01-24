package org.mql.java.ui.models;

import java.util.List;

public class ClassData {
	
	private long id;
	private String className;
	private List<String> fields;
	private List<String> methods;
	
	public ClassData(long id) {
		super();
		this.id = id;
	}
	
/*
 * 
 * 
 * 
 * */


	public ClassData(String className, List<String> fields, List<String> methods) {
		super();
		this.className = className;
		this.fields = fields;
		this.methods = methods;
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<String> getFields() {
		return fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	public List<String> getMethods() {
		return methods;
	}
	public void setMethods(List<String> methods) {
		this.methods = methods;
	}
	
	

}
