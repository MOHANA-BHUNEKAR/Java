package com.cloudwick.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationManager {

	public static void main(String[] args) throws ClassNotFoundException, IOException, FileExistException {

		serializeData();
		
		deserializeData();
		
	}

	
	private static void serializeData() throws FileExistException {
		
		System.out.println(Thread.currentThread());
		File f =new File("serialize.txt");
		
		if(f.exists())
		{
			
			throw new FileExistException("Provide unique filename");
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		
		try {
			fos = new FileOutputStream("Serialize.txt");
			
			out = new ObjectOutputStream(fos);
			
			User obj = new User();
			obj.setAge(25);
			obj.setName("Mohana Krishna");
			out.writeObject(obj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			if(fos != null)
			{
				
				try {
					
					fos.flush();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	private static void deserializeData() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("serialize.txt");
		ObjectInputStream oit = new ObjectInputStream(fis);
		
		User obj = (User) oit.readObject();
		System.out.println("Name: "+obj.getName());
		System.out.println("Age: "+obj.getAge());

	}
	}

