package script;

import java.util.*;
import java.io.*;

public class runScript {

	public static void main(String[] args) throws IOException {

		Process proc = Runtime.getRuntime().exec(
				"/mnt/d/Kaldi-Java/kaldi-trunk/tester.sh"); 
		BufferedReader read = new BufferedReader(
				new InputStreamReader(proc.getInputStream()));

		while (read.ready()) 
		{
			System.out.println(read.readLine());
		}

	}

}
