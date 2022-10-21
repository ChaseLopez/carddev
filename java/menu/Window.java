package menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import lib.CardLirbrary;
import lib.Set;

public class Window extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3123108470724862159L;
	private Image i = new ImageIcon("res/daimg.png").getImage();
	private JPanel expansionVeiwer;
	private JButton b;
	private Set innistrad;
	private Set m10;
	private Set currentSet;
	private CardLirbrary cl;
	private int count;
	private InfoPanel infoPanel;
	private JPanel mp;

	Window()
	{
		m10 = new Set("res/CardFile/2010.txt");
		cl = new CardLirbrary();
		mp = new JPanel();
		infoPanel = new InfoPanel();
		count = 0;

		mp.setBackground(Color.BLUE);

		b = new JButton();
		b.setText("Next");
		b.addActionListener(this);

		expansionVeiwer = new JPanel();
		expansionVeiwer.setBackground(new Color(181, 101, 29));
		expansionVeiwer.setPreferredSize(new Dimension(300, 500));
		expansionVeiwer.add(b, BorderLayout.NORTH);
		expansionVeiwer.add(infoPanel, BorderLayout.SOUTH);

		update();
		this.setIconImage(new ImageIcon("res/logo.jpg").getImage());
		this.setTitle("Deck Editor");
		this.setSize(1920, 1080);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b)
		{
			// System.out.println(innistrad.get(count).getName());
			this.getContentPane().removeAll();
			update();
			count = count + 6;
			this.revalidate();
			this.repaint();
		}
	}

	private void update()
	{
		mp.removeAll();
		infoPanel.update(m10.get(count));
		mp.add(new JLabel(new ImageIcon("res/" + m10.get(count).getImgLocation() + ".jpg")), BorderLayout.CENTER);

		mp.add(new JLabel(new ImageIcon("res/" + m10.get(count + 1).getImgLocation() + ".jpg")), BorderLayout.CENTER);
		mp.add(new JLabel(new ImageIcon("res/" + m10.get(count + 2).getImgLocation() + ".jpg")), BorderLayout.CENTER);
		mp.add(new JLabel(new ImageIcon("res/" + m10.get(count + 3).getImgLocation() + ".jpg")), BorderLayout.CENTER);
		mp.add(new JLabel(new ImageIcon("res/" + m10.get(count + 4).getImgLocation() + ".jpg")), BorderLayout.CENTER);
		mp.add(new JLabel(new ImageIcon("res/" + m10.get(count + 5).getImgLocation() + ".jpg")), BorderLayout.CENTER);
		mp.add(new JLabel(new ImageIcon("res/" + m10.get(count + 6).getImgLocation() + ".jpg")), BorderLayout.CENTER);

		mp.add(new JLabel(new ImageIcon("res/" + m10.get(count + 7).getImgLocation() + ".jpg")), BorderLayout.CENTER);

		this.add(infoPanel, BorderLayout.WEST);
		this.add(mp, BorderLayout.CENTER);
		this.add(expansionVeiwer, BorderLayout.EAST);
	}
}
