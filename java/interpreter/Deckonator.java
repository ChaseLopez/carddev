package interpreter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import interpreter.NCReader;

public class Deckonator
{
	public static void main(String[] args) throws IOException
	{
		String site = "http://magicplugin.normalitycomics.com/update/cardFiles/modern-expansions.txt";
		ArrayList<String> sitelist = new ArrayList<String>();
		Scanner sc = new Scanner(new File("sitelist.txt"));
		while (sc.hasNext())
		{
			String line = sc.nextLine();
			System.out.println(line);
			sitelist.add(line);

			NCReader nc = new NCReader(site);
			// nc.printMainDir();
			ArrayList<ArrayList<String>> me = nc.getMainDir();
			String expansionName = "lll";

			ArrayList<String> xlist = new ArrayList<String>();
			for (int i = 0; i < me.size() - 1; i++)
			{
				if (me.get(i).size() > 1)
					// if (me.get(i).get(1).equals(expansion))
					if (!xlist.contains(me.get(i).get(1)))
					{
						System.out.println(me.get(i).get(1));
						xlist.add(me.get(i).get(1));
					}
			}
			for (int j = 0; j < xlist.size(); j++)
			{
				// System.out.println(xlist.get(j));
				expansionName = xlist.get(j);
				FileWriter fw = new FileWriter("C:\\Users\\chase\\Desktop\\CardFilez\\" + expansionName + ".txt");
				PrintWriter pw = new PrintWriter(fw);
				for (int i = 0; i < me.size() - 1; i++)
				{
					if (me.get(i).size() > 1)
					{
						if (me.get(i).get(1).equals(xlist.get(j)))
						{
							// System.out.print(me.get(i).get(1));
							//pw.println(me.get(i));
						}
					}
				}
				fw.close();
				// System.out.println();
			}
		}
	}
}