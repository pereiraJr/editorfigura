/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ws.domore.editorfigura.negocio;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author mariojp
 */
public class Circulo extends Figura {

	public Circulo() {
		cor = Color.BLUE;
	}

	@Override
	public Shape desenhar() {
		return (Shape) new Ellipse2D.Double(x, y, 10, 10);
	}

}
