// 模擬試験 第1回 問2

package ex1;

import java.io.IOException;

public class Question2 {
	public static void main(String[] args) throws IOException {
		Question2File question2File = new Question2File("./output1.txt");
		question2File.addArrayList();
		for (int i = 0; i < question2File.arrayList.size(); i++) {
			System.out.println(question2File.arrayList.get(i));
		}
	}
}