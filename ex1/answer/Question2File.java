package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Question2File extends Question1File {
	File file;
	FileReader fileReader;
	BufferedReader bufferedReader;
	ArrayList<String> arrayList = new ArrayList<String>();
	Question2File(String readPath) {
		super(readPath);
		Question1File question1File = new Question1File(readPath);
		file = question1File.getFile();
	}
	public void setFile(File f) {
		file = f;
	}
	public File getFile() {
		return file;
	}
	void addArrayList() throws IOException {
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String str = bufferedReader.readLine();
			while (str != null) {
				arrayList.add(str);
				str = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}