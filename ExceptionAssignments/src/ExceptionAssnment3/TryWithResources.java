package ExceptionAssnment3;

import java.io.FileOutputStream;

public class TryWithResources {

	public static void main(String args[]) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("/file.txt")) {
			String msg = "try with resource";
			byte byteArray[] = msg.getBytes();
			fileOutputStream.write(byteArray);
			System.out.println("successfuly");
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

}
