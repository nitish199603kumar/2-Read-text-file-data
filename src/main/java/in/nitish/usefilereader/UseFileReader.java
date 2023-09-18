package in.nitish.usefilereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UseFileReader {

	public static void main(String[] args) throws IOException {
		
		 FileReader fr = new FileReader(
		            "C:\\Users\\NKSK\\Desktop\\New SpringBoot\\2-ReadTextFile\\src\\main\\resources\\BufferReaderText.txt");
		 
		        // Declaring loop variable
		        int i;
		        // Holds true till there is nothing to read
		        while ((i = fr.read()) != -1)
		        {
		            // Print all the content of a file
		            System.out.print((char)i);
		    }
	}

}
