package fileEx;

import java.io.*;
import java.util.Iterator;

public class FileEx02 {

	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("data1.txt");

		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
		fr.close();
	}

}
