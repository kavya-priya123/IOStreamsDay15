package ai.jobiak.streams;
import java.io.*;
public class KeyboardToFile {
	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter("myfile");
		DataInputStream dis=new DataInputStream(System.in);
		String data=dis.readLine();//It is used to read the string data
		while(!data.equals("stop")) {
			writer.write(data);
			//System.out.println(data);
			data=dis.readLine();
		}
		writer.close();
		System.out.println("after the loop");
	}
}
