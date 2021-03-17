package com.adactin.helper;

public class FileReaderManager {
	public static FileReaderManager getInstance()
	{
		FileReaderManager reader = new FileReaderManager();
		return reader;
		
	}
	

	public Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader helper = new Configuration_Reader();
		
		return helper;
		

	}

}
