/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.domore.editorfigura.negocio;

import java.awt.Color;
import java.awt.Shape;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mariojp
 */
public abstract class Figura {

	public static final String[] BOTOES = new String[] { "Quadrado",
			"Retangulo", "Circulo" };
	protected int x;
	protected int y;
	protected Color cor = Color.RED;

	public abstract Shape desenhar();

	public static Figura criar(int x, int y, String tipo) {
		Figura figura = null;

		switch (tipo) {
		case "Quadrado":
			figura = (Figura) new Quadrado();
			break;
		case "Retangulo":
			figura = (Figura) new Retangulo();
			break;
		case "Circulo":
			figura = (Figura) new Circulo();
			break;
		}
		figura.setX(x);
		figura.setY(y);
		return figura;

	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getCor() {
		return this.cor;
	}
}
