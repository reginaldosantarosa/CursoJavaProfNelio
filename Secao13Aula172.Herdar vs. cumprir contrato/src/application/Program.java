package application;

import model.entities.AbstratotPoligono;
import model.entities.Circulo;
import model.entities.Retangulo;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {

		AbstratotPoligono s1 = new Circulo(Color.BLACK, 2.0);
		AbstratotPoligono s2 = new Retangulo(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}
}
