package menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import lib.Card;

public class InfoPanel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4072546126182388534L;
	private String name;
	private String setName;
	private String imgLocation;
	private String actualSet;
	private String color;
	private String colorID;
	private String cost;
	private String convertedCost;
	private String type;
	private String power;
	private String toughness;
	private String loyalty;
	private String rarity;
	private String draftQualities;
	private String sound;
	private String script;
	private String text;

	public InfoPanel()
	{
		loadPanelSettings();
		this.name = "";
		this.setName = "";
		this.imgLocation = "";
		this.actualSet = "";
		this.color = "";
		this.colorID = "";
		this.cost = "";
		this.convertedCost = "";
		this.type = "";
		this.power = "";
		this.toughness = "";
		this.loyalty = "";
		this.rarity = "";
		this.draftQualities = "";
		this.sound = "";
		this.script = "";
		this.text = "";
	}

	public InfoPanel(Card c)
	{
		loadPanelSettings();
		this.name = c.getName();
		this.setName = c.getSetName();
		this.imgLocation = c.getImgLocation();
		this.actualSet = c.getActualSet();
		this.color = c.getColor();
		this.colorID = c.getColorID();
		this.cost = c.getCost();
		this.convertedCost = c.getConvertedCost();
		this.type = c.getType();
		this.power = c.getPower();
		this.toughness = c.getToughness();
		this.loyalty = c.getLoyalty();
		this.rarity = c.getRarity();
		this.draftQualities = c.getDraftQualities();
		this.sound = c.getSound();
		this.script = c.getScript();
		this.text = c.getText();
	}

	private void loadPanelSettings()
	{
		this.setPreferredSize(new Dimension(325, 500));
		this.setBackground(new Color(181, 101, 29));
		this.setLayout(new GridBagLayout());
	}

	public void update(Card c)
	{
		changeCard(c);
		this.removeAll();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 0;
		this.add(new JLabel(this.name), gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(new JLabel(this.setName), gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		this.add(new JLabel(this.imgLocation), gbc);
		gbc.gridx = 1;
		gbc.gridy = 3;
		this.add(new JLabel(this.actualSet), gbc);
		gbc.gridx = 1;
		gbc.gridy = 4;
		this.add(new JLabel(this.color), gbc);
		gbc.gridx = 1;
		gbc.gridy = 5;
		this.add(new JLabel(this.colorID), gbc);
		gbc.gridx = 1;
		gbc.gridy = 6;
		this.add(new JLabel(this.cost), gbc);
		gbc.gridx = 1;
		gbc.gridy = 7;
		this.add(new JLabel(this.convertedCost), gbc);
		gbc.gridx = 1;
		gbc.gridy = 8;
		this.add(new JLabel(this.type), gbc);
		gbc.gridx = 1;
		gbc.gridy = 9;
		this.add(new JLabel(this.power), gbc);
		gbc.gridx = 1;
		gbc.gridy = 10;
		this.add(new JLabel(this.toughness), gbc);
		gbc.gridx = 1;
		gbc.gridy = 11;
		this.add(new JLabel(this.loyalty), gbc);
		gbc.gridx = 1;
		gbc.gridy = 12;
		this.add(new JLabel(this.rarity), gbc);
		gbc.gridx = 1;
		gbc.gridy = 13;
		this.add(new JLabel(this.draftQualities), gbc);
		gbc.gridx = 1;
		gbc.gridy = 14;
		this.add(new JLabel(this.sound), gbc);
		gbc.gridx = 1;
		gbc.gridy = 15;
		this.add(new JLabel(this.script), gbc);
		gbc.gridx = 1;
		gbc.gridy = 16;
		this.add(new JLabel(this.text), gbc);
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(new JLabel("name"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(new JLabel("setName"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		this.add(new JLabel("imgLocation"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		this.add(new JLabel("actualSet"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		this.add(new JLabel("color"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		this.add(new JLabel("colorID"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 6;
		this.add(new JLabel("cost"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 7;
		this.add(new JLabel("convertedCost"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 8;
		this.add(new JLabel("type"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 9;
		this.add(new JLabel("power"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 10;
		this.add(new JLabel("toughness"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 11;
		this.add(new JLabel("loyalty"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 12;
		this.add(new JLabel("rarity"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 13;
		this.add(new JLabel("draftQualities"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 14;
		this.add(new JLabel("sound"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 15;
		this.add(new JLabel("script"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 16;
		this.add(new JLabel("text"), gbc);
	}

	private void changeCard(Card c)
	{
		this.name = c.getName();
		this.setName = c.getSetName();
		this.imgLocation = c.getImgLocation();
		this.actualSet = c.getActualSet();
		this.color = c.getColor();
		this.colorID = c.getColorID();
		this.cost = c.getCost();
		this.convertedCost = c.getConvertedCost();
		this.type = c.getType();
		this.power = c.getPower();
		this.toughness = c.getToughness();
		this.loyalty = c.getLoyalty();
		this.rarity = c.getRarity();
		this.draftQualities = c.getDraftQualities();
		this.sound = c.getSound();
		this.script = c.getScript();
		this.text = c.getText();
	}
}
