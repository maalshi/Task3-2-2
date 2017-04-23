package OutputStream;

	import java.io.BufferedReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.net.URLConnection;
	


	public class Output extends Main {

	   
	 FileWriter writer = new FileWriter("C:\\Users\\Shand\\Documents\\nam.xlsx", false);
	 String name = "John";
	 writer.write(name);
	 
	   
	}


