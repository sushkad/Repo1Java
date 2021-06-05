package SeleniumFileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFilenames {

	public static void main(String[] args) 
	{	
		String path = "/Users/Sushant.K/Downloads";

		File file = new File(path);

		File downloadDir[] = file.listFiles(); // remember return total no. of dir.

		Arrays.sort(downloadDir);

		for(File e : downloadDir)
		{
			if(e.isFile())
			{
				System.out.println("file :" + e.getName() + " " + e.getAbsolutePath());
			}
			else if(e.isDirectory())
			{
				System.out.println("Directory: " + e.getName() + " " + e.getAbsolutePath());
			}
			else {
				System.out.println("Not Known : " + e.getName() + " " + e.getAbsolutePath());

			}
		}
	}

}
