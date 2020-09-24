package view;

import java.util.Scanner;

import Implementation.Apparel_Impl;
import Implementation.ElectronicsImpl;
import Implementation.FoodItemsImpl;
import entity.WrongInputException;
import service.Service;

public class Main {
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose one : \n1. Food Items\n2. Apparel\n3. Electronics. \nEnter 1 or 2 or 3 : ");
			int inp = sc.nextInt();
			
			Service obj = null;
			if(inp == 1) {
				obj = new Service(new FoodItemsImpl());
				obj.report();
			}
			
			else if(inp == 2) {
				obj = new Service(new Apparel_Impl());
				obj.report();
			}
			
			else if(inp == 3) {
				obj = new Service(new ElectronicsImpl());
				obj.report();
			}
			
			else {
				throw new WrongInputException();
			}
		}
		catch(WrongInputException ex) {
			System.out.println(ex);
		}	
	}
}
