package myMusic;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class MyFile extends Thread {
	 private File file;
	
	public void start()  {
		MyFile mf;
		for(File file1:Arrays.asList(file.listFiles())) {
			if(file1.isDirectory()) {
				mf= new MyFile();
				mf.setFile(file);
				 
				mf.start();
			} else
				try {
					if(file1.getCanonicalPath().endsWith(".mp3")) {
						 System.out.println(file1.getCanonicalPath());
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		super.start();
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	 
}
