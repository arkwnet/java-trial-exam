package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Question1File {
	File file;
	FileReader fileReader;
	BufferedReader bufferedReader;
	FileWriter fileWriter;
	Question1File(String path) {
		file = new File(path);
	}
	public void write(String text) {
		try {
			fileWriter = new FileWriter(file, true);
			fileWriter.write(text + "\r\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void setFile(File f) {
		file = f;
	}
	public File getFile() {
		return file;
	}
}