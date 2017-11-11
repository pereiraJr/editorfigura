package factorys;

import java.awt.Color;

import ws.domore.editorfigura.negocio.Circulo;
import ws.domore.editorfigura.negocio.Figura;
import ws.domore.editorfigura.negocio.Quadrado;
import ws.domore.editorfigura.negocio.Retangulo;

/**
 *
 * @author pereiraJr
 */

// Fabrica de formas em azul, sobrescrevendo a cor original dos objetos
public class FiguraFactoryAzul {
	static Figura figura = null;

	public static Figura criarRetangulo(int x, int y) {
		figura = (Figura) new Retangulo();
		figura.cor = Color.BLUE;
		figura.setX(x);
		figura.setY(y);
		return figura;
	}

	public static Figura criarQuadrado(int x, int y) {
		figura = (Figura) new Quadrado();
		figura.cor = Color.BLUE;
		figura.setX(x);
		figura.setY(y);
		return figura;
	}

	public static Figura criarCirculo(int x, int y) {
		figura = (Figura) new Circulo();
		figura.cor = Color.BLUE;
		figura.setX(x);
		figura.setY(y);
		return figura;

	}

}
