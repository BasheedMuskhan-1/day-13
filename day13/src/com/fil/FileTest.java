package com.fil;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

class filetest {

	@Test
	void testFiles() throws IOException {
		FileInput f=new FileInput();
		String s="hello";
		String s2=s+".txt";
		f.files(s);
		String s1="";
		try {
			FileInputStream fis=new FileInputStream(s2);
			int i=0;
			
			while((i=fis.read())!=-1){    
	             s1=s1+(char)i;
	            }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(s,s1);
	}

}