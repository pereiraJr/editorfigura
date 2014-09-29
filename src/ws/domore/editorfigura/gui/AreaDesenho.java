package ws.domore.editorfigura.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.JPanel;

import ws.domore.editorfigura.negocio.Figura;

/**
 *
 * @author mariojp
 */
public class AreaDesenho extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Collection<Figura> figuras = new HashSet<>();

	public AreaDesenho() {
		this.setBackground(Color.WHITE);
		this.setLayout(null);
	}

	public AreaDesenho(LayoutManager mgr) {
		this.setBackground(Color.WHITE);
		this.setLayout(mgr);
	}

	public AreaDesenho(LayoutManager mgr, Color cor) {
		this.setBackground(cor);
		this.setLayout(mgr);
	}

	public void adicionarFigura(Figura f) {
		figuras.add(f);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		for (Figura f : figuras) {
			g2d.setColor(f.getCor());
			g2d.draw(f.desenhar());
		}
	}

}
