package interpreter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NCReader
{ 
	BufferedReader inputFile;
	public ArrayList<ArrayList<String>> mainDir;

	public ArrayList<ArrayList<String>> getMainDir()
	{
		return mainDir;
	}

	public NCReader(String path) throws IOException
	{
		this.mainDir = new ArrayList<ArrayList<String>>();
		this.inputFile = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		loadData(mainDir);
	}

	private void loadData(ArrayList<ArrayList<String>> mainDir) throws IOException
	{
		String lineFromFile;
		int count = 0;
		while ((lineFromFile = inputFile.readLine()) != null)
		{
			String[] seporatedLine = lineFromFile.split("	");
			ArrayList<String> placeHolder = new ArrayList<String>();
			for (String word : seporatedLine)
			{
				placeHolder.add(word);
			}
			mainDir.add(placeHolder);
		}
		inputFile.close();
	}

	public void printMainDir()
	{
		for (ArrayList<String> l : mainDir)
		{
			for (String s : l)
			{
				System.out.print(s + "	");
			}
			System.out.println();
		}
	}
}
