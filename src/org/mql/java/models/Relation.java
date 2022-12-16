package org.mql.java.models;

public class Relation {

	private ClassModel first, second;
	private Cardinal firstCard, secondCard;
	private RelationType type;
	
	
	
	public Relation() {
		super();
	}


	public Relation(ClassModel first, ClassModel second, Cardinal firstCard, Cardinal secondCard, RelationType type) {
		super();
		this.first = first;
		this.second = second;
		this.firstCard = firstCard;
		this.secondCard = secondCard;
		this.type = type;
	}


	public String toString() {
		return "Relation [{ "+ first.getName() +" { "+ firstCard +" , "+ secondCard+" } "+" : "+second.getName()    +" }, type=" + type + "]";
	}
	
	
	
	
	
	
}
