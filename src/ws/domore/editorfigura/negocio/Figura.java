/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.domore.editorfigura.negocio;

import java.awt.Color;
import java.awt.Shape;

/**
 *
 * @author mariojp
 */
public abstract class Figura {

	public static final String[] BOTOES = new String[] { "Quadrado Azul", "Retangulo Azul", "Circulo Azul",
			"Quadrado Vermelho", "Retangulo Vermelho", "Circulo Vermelho" };
	protected int x;
	protected int y;
	public Color cor = null;

	public abstract Shape desenhar();

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
