/*
 * COMPANY NAME: Educational OnLine
 * COPYRIGHT                                       
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * PROJECT NAME: Program Goals
 * 
 */

package com.eolinc.programgoals.parentinput;

import java.io.*;

public class FileToText implements FileToTextInterface {


	private FileToText() {}

	private static FileToText uniqueInstance = new FileToText();


	/**
	 * Constructor
	 * 
	 * This class implements the Singleton pattern.
	 * 
	 * @returns the one instance of FileToText.
	 */
	public static FileToText getInstance () {
		return uniqueInstance;
	}

	/**
	 * Fetch the entire contents of a text file, and return it in a String.
	 * This style of implementation does not throw Exceptions to the caller.
	 * 
	 * This class implements the Singleton pattern.
	 *
	 * @param aFile is a file which already exists and can be read.
	 * @returns a String containing the contents of the file.
	 */

	public String getContents(File aFile) {
		//...checks on aFile are elided
		StringBuilder contents = new StringBuilder();

		try {
			//use buffering, reading one line at a time
			//FileReader always assumes default encoding is OK!
			BufferedReader input =  new BufferedReader(new FileReader(aFile));
			try {
				String line = null; //not declared within while loop
				/*
				 * readLine is a bit quirky :
				 * it returns the content of a line MINUS the newline.
				 * it returns null only for the END of the stream.
				 * it returns an empty String if two newlines appear in a row.
				 */
				while (( line = input.readLine()) != null){
					contents.append(line);
					contents.append(System.getProperty("line.separator"));
				}
			}
			finally {
				input.close();
			}
		}
		catch (IOException ex){
			ex.printStackTrace();
		}

		return contents.toString();
	}
}
