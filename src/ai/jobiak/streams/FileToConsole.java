package ai.jobiak.streams;
import java.io.*;
public class FileToConsole {
	public static void main(String[] args) throws IOException {
		//byte streams
		FileInputStream fis=new FileInputStream("C:\\Users\\Fresher\\eclipse-workspace\\IOStreamsDay15\\src\\ai\\jobiak\\streams\\FileToConsole.java");
		int data=fis.read();
		while(data!=-1) {
		//System.out.println(data);
		System.out.print((char)data);//type casting-->byte to char
        data=fis.read();
	    }
	}
}
