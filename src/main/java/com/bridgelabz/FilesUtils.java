package com.bridgelabz;

import java.io.File;

public class FilesUtils {
	
	public static boolean deleteFiles(File contentToDelete) {
		File[] allData = contentToDelete.listFiles();// using variable call listFiles method that will be store in
														// allData variable
		if (allData != null) {
			for (File file : allData) {// iterate for each loop over addData
				deleteFiles(file);// calling method
			}
		}
		return contentToDelete.delete();
	}
}
