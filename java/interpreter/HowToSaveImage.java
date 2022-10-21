/*
 * Formats:
 * 	standard -  most recent released sets
 * 	modern - from Eigth edition and mirrodin through today
 * 	commander - legendary creature is commander 100card deck
 * 	legacy	-	all cards from legal sets but bans certain cards
 * 	vintage - legacy plus some ban list
 * 	block	- only 1 block
 * 	pauper	- only common rarity cards
 * 	pioneer - return to ravnica forward
 * 
 * 	Innistrad Block
 * 	ISD - Innistrad
 * 	DKA - Dark Ascension
 * 	AVR - Avacyn Restored
 */
package interpreter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class HowToSaveImage
{

	public static void main(String[] args) 
	{
		String set = "m10";
		for (int i = 1; i <= 262; i++)
		{
			System.out.println(i);

			String imageUrl = "http://magicplugin.normalitycomics.com/cardimages/" + set + "/" + i + ".jpg";
			String destinationFile = "res/" + set + "/" + i + ".jpg";

			try
			{
				saveImage(imageUrl, destinationFile);
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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

}