package Day0627;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "가".getBytes();

		System.out.println(data.length);
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		
		System.out.println(Integer.toHexString(256 + data[0]));
		System.out.println(Integer.toHexString(256 + data[1]));
		System.out.println(Integer.toHexString(256 + data[2]));
		// "가"의 Unicode는 %EA%B0%80
		
		os.write(data, 1, 2);
		os.flush();
		os.close();
	}
}
