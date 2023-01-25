package org.mql.java.ui;

import java.awt.Color;
import java.awt.Graphics;

public class RelationPainter {
	
	
	private ClassPainter c1,c2;
	
	
	public RelationPainter() {
	}
	
	public RelationPainter(ClassPainter c1, ClassPainter c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	public void etablishRelation(Graphics g) {
		g.setColor(Color.RED);
		g.drawLine(c1.getLiaison().getRight().x, c1.getLiaison().getRight().y, c2.getLiaison().getLeft().x, c2.getLiaison().getLeft().y);
	}
}