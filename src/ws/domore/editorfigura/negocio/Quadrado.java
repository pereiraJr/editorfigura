/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.domore.editorfigura.negocio;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author mariojp
 */
public class Quadrado extends Figura {

    public Quadrado() {
        cor = Color.BLUE;
    }

    @Override
    public Shape desenhar() {
        return new Rectangle2D.Double(x, y, 10, 10);

    }


}
