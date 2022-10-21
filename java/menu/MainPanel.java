package menu;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8927190186289063492L;

	MainPanel()
	{
		this.setBackground(Color.blue);
		this.setLayout(new BorderLayout());
	}
}
// this is where you will be displaying most of the cards (hearthstone is a good starting point) other veiwing methods poetntially
// on deck editor deckstats.net seems to be a good starting point 
// finding out how you want to lay out the window
