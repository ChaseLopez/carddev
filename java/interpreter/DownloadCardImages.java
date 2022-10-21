package interpreter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;

import lib.Card;
import lib.CardLirbrary;
import lib.Set;

public class DownloadCardImages
{

	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("res/errors.txt");
		PrintWriter pw = new PrintWriter(fw);
		CardLirbrary cl = new CardLirbrary();
		
		for (Set s : cl.getLib())
		{
			///System.out.println(s.get(0).getSetName());
			String setName = s.get(0).getSetName();
			String destinationFile = "res/cardImages/";
			//createFoldersForImages(s);
			System.out.println("DONE! " +s.get(0).getActualSet());
			for (Card c : s.getCardList())
			{
				// System.out.println(c.getImgLocation());
				///System.out.println("													   "+c.getSetName());
				System.out.println("								    	     "+destinationFile + c.getImgLocation() + ".jpg");
				System.out.println("http://magicplugin.normalitycomics.com/cardimages/" + c.getImgLocation() + ".jpg\n");
				
				String imageUrl = "http://magicplugin.normalitycomics.com/cardimages/" + c.getImgLocation() + ".jpg";

				try
				{
					saveImage(imageUrl, (destinationFile + c.getImgLocation() + ".jpg"));
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
					pw.println(e);
				}
			}
		}
		fw.close();
		pw.close();
		System.out.println("endofmain");
	}

	public static void saveImage(String imageUrl, String destinationFile) throws IOException
	{
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1)
		{
			os.write(b, 0, length);
		}

		is.close();
		os.close();
	}

	private static void createFoldersForImages(Set s)
	{
		// or this is s.getActuallSetName()
		String path = "C:\\Users\\chase\\eclipse-workspace\\MCCG2\\res\\cardImages\\" + s.getSetName();
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
		else
		{
			System.out.println("Folder Exist");
		}
	}
}
