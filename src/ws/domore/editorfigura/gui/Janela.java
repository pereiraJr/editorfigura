package ws.domore.editorfigura.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import ws.domore.editorfigura.negocio.Figura;

/**
 *
 * @author mariojp
 */
public class Janela extends JFrame implements ActionListener {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Set<JToggleButton> botoes = new HashSet<JToggleButton>();
    private AreaDesenho painel = new AreaDesenho(null);

    public Janela(String nome) {
        super(nome);
        this.setLayout(new BorderLayout());
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(Figura.BOTOES.length, 1));
        for (String s : Figura.BOTOES) {
            JToggleButton tb = new JToggleButton(s);
            tb.addActionListener(this);
            botoes.add(tb);
            grid.add(tb);
        }
        JPanel lateral = new JPanel();
        lateral.setBackground(Color.GREEN);
        lateral.add(grid);

        painel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelMouseClicked(evt);
            }
        });


        this.add(BorderLayout.CENTER, painel);
        this.add(BorderLayout.WEST, lateral);

        this.setSize(400, 350);

        this.setVisible(true);

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        JToggleButton botao = (JToggleButton) e.getSource();
        for (JToggleButton tb : botoes) {
            tb.setSelected(false);
        }
        botao.setSelected(true);
    }

    public void painelMouseClicked(MouseEvent evt) {
        int x = evt.getX();
        int y = evt.getY();
         for (JToggleButton tb : botoes) {
            if(tb.isSelected()){
                this.painel.adicionarFigura(Figura.criar(x, y, tb.getText()));
            }
        }
        this.painel.updateUI();
    }

    public static void main(String[] args) {
        Janela j = new Janela("Janela Editor");
        j.setVisible(true);

    }
}
