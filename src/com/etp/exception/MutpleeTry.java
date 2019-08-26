package com.etp.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MutpleeTry {
	
	public static void main(String[] args) {
		
		try {
			throw new IOException();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
