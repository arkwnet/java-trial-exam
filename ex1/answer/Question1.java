// 模擬試験 第1回 問1

package ex1;

public class Question1 {
	public static void main(String[] args) {
		Question1File question1File = new Question1File("./output1.txt");
		for (int i = 0; i < 5; i++) {
			question1File.write("Hello World");
		}
	}
}