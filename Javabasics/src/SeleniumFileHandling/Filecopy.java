package SeleniumFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

public class Filecopy {

	//file hadling - 1 ;
	//copy a file PDF and create different file in the same location


	public static void main(String[] args) {

		CopyFile();

	}

	public static void CopyFile()
	{

		File file = new File("/Users/Sushant.K/Downloads/Online.pdf");
		File cofile = new File("/Users/Sushant.K/Downloads/Online-copy.pdf");

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(cofile);


		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			System.out.println(fileInputStream.available());
		} catch (IOException e) {

			e.printStackTrace();
		}

		int i = 0;
		try {
			while((i = fileInputStream.read()) !=-1)
			{
				fileOutputStream.write(i);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		finally
		{
			if(fileInputStream != null)
			{
				try {
					fileInputStream.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}

			if(fileOutputStream != null)
			{
				try {
					fileOutputStream.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		}

	}
}