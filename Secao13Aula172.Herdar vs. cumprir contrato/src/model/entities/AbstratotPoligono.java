package model.entities;

import model.enums.Color;

public abstract class AbstratotPoligono implements Poligono {

	private Color color;

	public AbstratotPoligono(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
