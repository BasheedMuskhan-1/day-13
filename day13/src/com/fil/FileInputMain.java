package com.fil;

import java.util.Scanner;

public class FileInputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInput fi=new FileInput();
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		String name=s.next();
		fi.files(name);
		System.out.println("file created");
	}

}