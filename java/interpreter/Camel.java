package interpreter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import lib.Set;

public class Camel
{

	public static void main(String[] args) throws FileNotFoundException
	{

		Scanner sc = new Scanner(new File("res/errors.txt"));
		while (sc.hasNext())
		{
			createFoldersForImages(sc.nextLine());
		}
		sc.close();
	}

	private static void createFoldersForImages(String please)
	{
		String path = "C:\\Users\\chase\\eclipse-workspace\\MCCG2\\res\\cardImages\\" + please;
		File dir = new File(path);
		if (!dir.exists())
		{
			if (dir.mkdir())
			{
				System.out.println("Folder created");
			} else
			{
				System.out.println("Failed to be made");
			}
		}
	}
}
