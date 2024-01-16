package com.mkpits.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// If i edit the file argument adding or renaming it it may show
		// FileNotFoundException
		FileReader fr = new FileReader(
				"D:\\mkpits_workspace\\MKPITS_CORE_JAVA_REGVED_PANDE\\src\\com\\mkpits\\file\\FileInputStreamReader.java");
		BufferedReader br = new BufferedReader(fr);
		String read = "";
		// we are assigning words one by one in read which must be a String Type
		while ((read = br.readLine()) != null) {
			System.out.println(read);

		}

	}

}
