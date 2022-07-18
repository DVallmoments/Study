package Day0629;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "shkim".toCharArray();
		for (int i = 0; i < data.length; i++) {
			writer.write(data[i]);
			System.out.println(i);
		}
		writer.flush();
		writer.close();
	}
}
