package lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Set
{
	private ArrayList<Card> setCards;
	private String setName;

	public Set(String path)
	{
		setCards = new ArrayList<Card>();
		Scanner sc;
		try
		{
			sc = new Scanner(new File(path));
			while (sc.hasNextLine())
			{
				Card p = new Card(sc.nextLine());
				setCards.add(p);
			}
			sc.close();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		//Print set names 
		//System.out.println(setName = setCards.get(0).getActualSet());
	}

	public Card get(int cardNumber)
	{
		return setCards.get(cardNumber);
	}

	public ArrayList<Card> getCardList()
	{
		return setCards;
	}

	public String getSetName()
	{
		return setName;
	}
}
