package factorys;

import ws.domore.editorfigura.negocio.Figura;
/**
*
* @author pereiraJr
*/
//Fabrica de Figuras que será mandada para Camada de Gui
public class FabricaImpressao {

	public static Figura montarFigura(int x, int y, String tipo) {
		//É criado um vetor com os campos Tipo e Cor da forma geometrica com Base no Label dos botoes configurados em Figura
		String[] tipoCor = tipo.split(" ");
		Figura figura = null;
		//Caso seja azul invoca somente Métodos de Criacao da FiguraFactoryAzul
		if (tipoCor[1].equals("Azul")) {
			switch (tipoCor[0]) {
			case "Quadrado":
				figura = (Figura) FiguraFactoryAzul.criarQuadrado(x, y);
				break;
			case "Retangulo":
				figura = (Figura) FiguraFactoryAzul.criarRetangulo(x, y);
				break;
			case "Circulo":
				figura = (Figura) FiguraFactoryAzul.criarCirculo(x, y);
				break;
			}
			//Caso seja vermelho invoca somente Métodos de Criacao da FiguraFactoryVermelho
		} else if (tipoCor[1].equals("Vermelho")) {
			switch (tipoCor[0]) {
			case "Quadrado":
				figura = (Figura) FiguraFactoryVermelho.criarQuadrado(x, y);
				break;
			case "Retangulo":
				figura = (Figura) FiguraFactoryVermelho.criarRetangulo(x, y);
				break;
			case "Circulo":
				figura = (Figura) FiguraFactoryVermelho.criarCirculo(x, y);
				break;
			}
		}

		return figura;

	}

}
