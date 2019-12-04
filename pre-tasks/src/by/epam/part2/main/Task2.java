package by.epam.part2.main;

import java.io.IOException;

import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import exceptions.NullPriceException;
import speed.SpeedList;
import speed.SpeedMap;
import speed.SpeedSet;
import stream.StreamFile;
import xml.XmlDomParser;


public class Task2 {
		
	
		public static void main(String[] args) throws NullPriceException, ParserConfigurationException, SAXException, IOException {

			Task2.CreateBouquetTask();
			Task2.SpeedTask();
			Task2.StreamTask();
			Task2.XmlTask();
			
		
		}
		
		public static void XmlTask()  {
			try {
				XmlDomParser parser = new XmlDomParser();
				ArrayList<String> list = new ArrayList<String>();
				try {
					list = parser.readFile();
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			} catch (IOException e) {
				System.out.println("File is not found");
				
			}
			
		}
		
	public static void StreamTask() {
			
		
			try {
				String fileData = StreamFile.readFile();
				System.out.println(fileData);
			} catch (IOException e) {
				System.out.println("File is not found");
				
			}
			
			
		}
		
	public static void SpeedTask() {
			
			SpeedList.ListSpeed();	
			SpeedSet.ListSpeed();
			SpeedMap.ListSpeed();
		}
	
	public static void CreateBouquetTask () {
		FlowerList flowers = new FlowerList();
		PackagingList packagings = new PackagingList();

		Bouquet bouqet = new Bouquet();

		Flower roseRed = new Flower("rose", "red", 30, 5.50, 5);
		Flower roseWhite = new Flower("rose", "white", 50, 10.50, 5);

		Packaging craftPaper = new Packaging("craft paper", "paper", "grey", 1, 1.5);
		Packaging ribbon = new Packaging("ribbon", "silk", "violet", 1, 0.5);

		flowers.add(roseRed);
		flowers.add(roseWhite);

		packagings.add(craftPaper);
		packagings.add(ribbon);

		bouqet.add(flowers, packagings);

		System.out.println(bouqet.toString());

	}	
	}
	/*	public static void main(String[] args) throws Exception, ParserConfigurationException, SAXException, IOException  {

			FlowerList flowers = new FlowerList();
			PackagingList packagings = new PackagingList();

			Bouquet bouqet = new Bouquet();

			Flower roseRed = new Flower("rose", "red", 30, 5.50, 5);
			Flower roseWhite = new Flower("rose", "white", 50, 10.50, 5);

			Packaging craftPaper = new Packaging("craft paper", "paper", "grey", 1, 1.5);
			Packaging ribbon = new Packaging("ribbon", "silk", "violet", 1, 0.5);

			flowers.add(roseRed);
			flowers.add(roseWhite);

			packagings.add(craftPaper);
			packagings.add(ribbon);

			bouqet.add(flowers, packagings);

			System.out.println(bouqet.toString());
			
			SpeedTask();
			StreamTask();
			XmlTask();
		}
		
		public static void XmlTask()  {
			try {
				XmlDomParser parser = new XmlDomParser();
				ArrayList<String> list = new ArrayList<String>();
				try {
					list = parser.readFile();
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			} catch (IOException e) {
				System.out.println("File is not found");
				
			}
			
		}
	
		public static void SpeedTask() {
			
			SpeedList.ListSpeed();	
			SpeedSet.ListSpeed();
			SpeedMap.ListSpeed();
		}
		
		public static void StreamTask() {
			//StreamFile streaming = new StreamFile();
		
			try {
				String fileData = StreamFile.readFile();
				System.out.println(fileData);
			} catch (IOException e) {
				System.out.println("File is not found");
				
			}
			
			
		}
	}
*/
