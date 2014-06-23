package classes.Fodas.Pra.Caralho;

import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * @author luiznazari
 * @author alessandrobelini
 * 
 * @version 1.2
 * 
 * Classe utilizada para auziliar na manipulação de
 * componentes utilizando GridBagLayout
 */
public class GridConstraints extends GridBagConstraints {
	private static final long serialVersionUID = 7965337936863038597L;

	public GridConstraints() {
		new GridBagConstraints();
	}

	public GridConstraints setGridLocation(int gridy, int gridx) {
		this.gridy = gridy;
		this.gridx = gridx;
		return this;
	}

	public GridConstraints setAnchor(int anchor) {
		this.anchor = anchor;
		return this;
	}

	public GridConstraints setFill(int fill) {
		this.fill = fill;
		return this;
	}
	
	public GridConstraints setOccupiedSize(int gridwidth, int gridheight) {
		this.gridwidth = gridwidth;
		this.gridheight = gridheight;
		return this;
	}

	public GridConstraints setGridWeight(double weightx, double weighty) {
		this.weightx = weightx;
		this.weighty = weighty;
		return this;
	}

	public GridConstraints setInsets(int distance) {
		this.insets = new Insets(distance, distance, distance, distance);
		return this;
	}
	
	public GridConstraints setInsets(int top, int right, int bottom, int left) {
		this.insets = new Insets(top, left, bottom, right);
		return this;
	}
	
	public GridConstraints setInsets(int vertical, int horizontal) {
		this.insets = new Insets(vertical, horizontal, vertical, horizontal);
		return this;
	}

	public GridConstraints setIpad(int ipadx, int ipady) {
		this.ipadx = ipadx;
		this.ipady = ipady;
		return this;
	}
}
