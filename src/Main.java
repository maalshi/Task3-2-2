import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import Comparators.NameComparator;
import Comparators.PowerComparator;
import Items.ElectricityItem;
import Items.Fan;
import Items.Refrigirator;
import Items.VacuumCleaner;



public class Main {
	   

		

		public static void main(String[] args) throws IOException {
						

		
		
		ArrayList<ElectricityItem> listFromFile= new ArrayList<ElectricityItem>(); 
		try {
			
			
			
			File file = new File("C:\\name.txt");
			String  nameLabel="name= ";
			String  powerLabel=" power= ";
			String  consumptionLabel=" consumption= ";
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				int startIndexName=line.indexOf(nameLabel);
				int startIndexPower=line.indexOf(powerLabel);
				int startIndexConsumption=line.indexOf(consumptionLabel);
				
				String nameFromFile=line.substring(startIndexName+nameLabel.length(), startIndexPower);
				String powerFromFile=line.substring(startIndexPower+powerLabel.length(), startIndexConsumption);
				String consumptionFromFile=line.substring(startIndexConsumption+consumptionLabel.length(), line.length());
				
				ElectricityItem itemFromFile= new Fan(nameFromFile, Integer.parseInt(powerFromFile), Integer.parseInt(consumptionFromFile));
				listFromFile.add(itemFromFile);
			}
			fileReader.close();
			System.out.println(listFromFile);
		
		} catch (IOException e) {
			e.printStackTrace();
			}

		
	}
}


		
		
		
		
		
		

		

		

	
