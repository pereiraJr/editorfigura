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
public class Retangulo extends Figura {
     public Retangulo(){
        cor = Color.RED;
    }
     
    @Override
    public Shape desenhar() {
       return  new Rectangle2D.Double(x, y, 30, 10);
    }
}
