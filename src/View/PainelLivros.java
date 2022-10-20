package View;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;

public class PainelLivros extends JPanel {

	/**
	 * Create the panel.
	 */
	public PainelLivros() {
		setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setMaximumSize(new Dimension(100, 100));
		setBackground(Color.PINK);
		setVisible(getFocusTraversalKeysEnabled());
		
		JLabel lblLivro = new JLabel("New label");
		lblLivro.setIcon(new ImageIcon("C:\\Users\\ricar\\eclipse-workspace\\Atividade-curso\\src\\util\\livro.png"));
		
		JLabel lblTitulo = new JLabel("titulo");
		lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitulo.setFont(new Font("DejaVu Serif", Font.PLAIN, 14));
		
		JLabel lblPontos = new JLabel("Pontos");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Esse Eu J\u00E1 Li!");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblLivro, GroupLayout.PREFERRED_SIZE, 141, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
								.addComponent(lblPontos, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))))
					.addGap(43))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLivro)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTitulo)
					.addGap(11)
					.addComponent(lblPontos)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
