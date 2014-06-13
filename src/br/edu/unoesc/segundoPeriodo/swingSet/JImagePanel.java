package br.edu.unoesc.segundoPeriodo.swingSet;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * A panel that contains a background image. The background image is
 * automatically sized to fit in the panel.
 */
public class JImagePanel extends JPanel {
	BufferedImage background = null;

	/**
	 * Creates a new panel with the given background image.
	 * 
	 * @param img
	 *            The background image.
	 */
	public JImagePanel(BufferedImage img) {
		if (img == null)
			throw new NullPointerException("Buffered image cannot be null!");
		this.background = img;
	}

	/**
	 * Creates a new panel with the given background image.
	 * 
	 * @param img
	 *            The background image.
	 * @throws IOException
	 *             , if the image file is not found.
	 */
	public JImagePanel(File imgSrc) throws IOException {
		this(ImageIO.read(imgSrc));
	}

	/**
	 * Creates a new panel with the given background image.
	 * 
	 * @param img
	 *            The background image.
	 * @throws IOException
	 *             , if the image file is not found.
	 */
	public JImagePanel(String fileName) throws IOException {
		this(new File(fileName));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), null);
		g2d.dispose();
	}
}
