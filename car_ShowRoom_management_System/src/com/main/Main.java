package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.entity.Entity;
import com.Doa.CarDoa;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("welcome to Akash Personal Car Showroom \n");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		boolean go=true;
		while(go)
		{
			System.out.println("press 1 to ADD new Car");
			System.out.println("press 2 to delete Car ");
			System.out.println("press 3 to display All Car Details");
			System.out.println("press 4 to update Car details");
			System.out.println("press 5 to display Only Karnataka KA registerd data");
			System.out.println("press 6 to display Only Akash's cars data");

			System.out.println("press 7 to EXIT Application");
			
			System.out.println("ENTER YOUR CHOICE :");
			
			 int choice=Integer.parseInt(br.readLine());
			
			switch (choice) 
			{
				case 1: //add student
					System.out.println("enter car id :");				
					int id = Integer.parseInt(br.readLine());
				
					System.out.println("Enter car company :");				
					String company= br.readLine();              

				
					System.out.println("Enter car name :");			
					String name= br.readLine();            
				
					System.out.println("Enter car owner :");
					String owner= br.readLine();  
					
					System.out.println("Enter car owner phone number:");
					String ownerInfo= br.readLine(); 
					
					System.out.println("Enter car Licence number:");
					String licence= br.readLine(); 
				
					
				//create student object to store the data 
					Entity st = new Entity(id,company, name,owner,ownerInfo,licence);
				
				
					boolean yes = CarDoa.insertCar(st);
				
					if(yes)
					{
						System.out.println("Car details is added successfully");
					}
					else
					{
						System.out.println("Something went wrong, Data not added..!");
					}
					System.out.println(st);
				
					break;
			
				case 2: // delete student
				
					System.out.println("Enter the car id you wanted to delete");
					int carId = Integer.parseInt(br.readLine());
					
					boolean yes1 = CarDoa.deleteCar(carId);
					
					if(yes1)
					{
						System.out.println("Car with id : "+carId+" is deleted Succesfully");
					}
					
					else
					{
						System.out.println("Something went wrong, Data not deleted...!");
					}
				
					break;
			
				case 3: // display students 
				
					CarDoa.displayAllCar();
				
					break;
				
				case 4: // update student
					System.out.println("enter Car id which data you want to update");
					int carId2 = Integer.parseInt(br.readLine());
//				
					System.out.println("enter Car id :");
					int id2 = Integer.parseInt(br.readLine());
				
					System.out.println("Enter Car company :");
					String company2= br.readLine();
				
					System.out.println("Enter Car name :");
					String name2= br.readLine();
				
					System.out.println("Enter Car Owner Name :");
					String owner2= br.readLine();
					
					System.out.println("Enter Car Owner Phone number :");
					String ownerInfo2= br.readLine();
					
					System.out.println("Enter car Licence number:");
					String licence2= br.readLine(); 
				
					//create student object to store the data 
					Entity st2 = new Entity(id2,company2, name2,owner2,ownerInfo2,licence2);
				
					boolean yes2 =CarDoa.updateCar(st2,carId2);
				
					if(yes2)
					{
						System.out.println("Car details updated successfully");
					}
					else
					{
						System.out.println("Something went wrong, Car details not Updated...!");
					}
					System.out.println(st2);
					break;
					
					
					
				case 5: // Display KA Registered Data
					
					CarDoa.displayKACars();
					
					break;
					
				case 6: // Display Akash's Cars
					
					CarDoa.displayAkashCars();
					
					break;
				
				
				case 7: // exit
					go=false;
					break;
				
				
				default:
					System.out.println("wrong choice try again");
				}
			
			
			
				}
			System.out.println("Thank You Visit again....!!");
			
			
		}

}
