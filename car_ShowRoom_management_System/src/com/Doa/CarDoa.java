package com.Doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.connectionjdbc.Connectionjdbc;
import com.entity.Entity;
//import com.entity.Student;

public class CarDoa {
	
	
///////////////////////////////////////////////////////////////////////////////
// for adding car into database
//////////////////////////////////////////////////////////////////////////////

	public static boolean insertCar(Entity st)
	{
		boolean f=false;
		try
		{
		

			Connection con = Connectionjdbc.createC();
			String q="Insert into carlist(carId,carCompany, carName, carOwner, ownerinfo, licenceNo) values(?,?,?,?,?,?)";
			PreparedStatement p = con.prepareStatement(q);

			p.setInt(1, st.getCarId());
			p.setString(2, st.getCarCompany());
			p.setString(3, st.getCarName());
			p.setString(4, st.getCarOwner());
			p.setString(5, st.getOwnerPhone());
			p.setString(6, st.getLicenseNo());



			//execute

			p.executeUpdate();
			f=true;

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

		return f;
}
	
	
///////////////////////////////////////////////////////////////////////////////
//for deleting car from database
//////////////////////////////////////////////////////////////////////////////

	public static boolean deleteCar(int carId)
	{
		boolean f = false;
		try
		{
			Connection con = Connectionjdbc.createC();
			
			String q = "delete from carlist where carId=?";
			
			PreparedStatement p = con.prepareStatement(q);
			
			p.setInt(1, carId);
			
			p.executeLargeUpdate();
			f=true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
		
	}
	
	
///////////////////////////////////////////////////////////////////////////////
//for display cars in database
//////////////////////////////////////////////////////////////////////////////

	
	public static void displayAllCar()
	{
		try
		{
			Connection con = Connectionjdbc.createC();

			String q = "SELECT * FROM carlist;";

			Statement s= con.createStatement();
		       
			ResultSet set =s.executeQuery(q);
       
			while(set.next())
			{
				int id= set.getInt(1);
				String comp =set.getString(2);
				String cname =set.getString(3);
				String ownername =set.getString(4);
				String ownerPhone =set.getString(5);
				String LicenceNum =set.getString(6);
    	   
				System.out.println("  Car ID           : "+id);
				System.out.println("  Car Company name : "+comp);
				System.out.println("  Car Name         : "+cname);
				System.out.println("  Car Owner name   : "+ownername);
				System.out.println("  Car Owner Phone  : "+ownerPhone);
				System.out.println("  Car Licence No   : "+LicenceNum);
    	   
				System.out.println("_______________________________________________________________");
    	   
			}
		
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	
	
//////////////////////////////////////////////////////////////////////////////////////////
//for UPDATE details of students in database
/////////////////////////////////////////////////////////////////////////////////////////


	public static boolean updateCar(Entity st, int carId2) 
	{
		boolean f=false;
		try
		{
	

			Connection con = Connectionjdbc.createC();
			String q="update carlist set carId=?, carCompany=?,carName=? ,carOwner=?, ownerinfo=?, licenceNo=? where carId=?";
			PreparedStatement p = con.prepareStatement(q);

			p.setInt(1, st.getCarId());
			p.setString(2, st.getCarCompany());


			p.setString(3, st.getCarName());
			p.setString(4, st.getCarOwner());
			p.setString(5, st.getOwnerPhone());
			p.setString(6, st.getLicenseNo());
			p.setInt(7, carId2);


			//execute

			p.executeUpdate();
			f=true;

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

		return f;

	}
	
	
///////////////////////////////////////////////////////////////////////////////
//for display KA cars in database
//////////////////////////////////////////////////////////////////////////////
	
	
	public static void displayKACars()
	{
		try
		{
			Connection con = Connectionjdbc.createC();

			String q = "SELECT * FROM carlist WHERE licenceNo LIKE 'KA%';";

			Statement s= con.createStatement();
		       
			ResultSet set =s.executeQuery(q);
       
			while(set.next())
			{
				int id= set.getInt(1);
				String comp =set.getString(2);
				String cname =set.getString(3);
				String ownername =set.getString(4);
				String ownerPhone =set.getString(5);
				String LicenceNum =set.getString(6);
    	   
				System.out.println("  Car ID           : "+id);
				System.out.println("  Car Company name : "+comp);
				System.out.println("  Car Name         : "+cname);
				System.out.println("  Car Owner name   : "+ownername);
				System.out.println("  Car Owner Phone  : "+ownerPhone);
				System.out.println("  Car Licence No   : "+LicenceNum);
    	   
				System.out.println("_______________________________________________________________");
    	   
			}
		
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	
///////////////////////////////////////////////////////////////////////////////
//for display KA cars in database
//////////////////////////////////////////////////////////////////////////////


	public static void displayAkashCars()
	{
		try
		{
			Connection con = Connectionjdbc.createC();

			String q = "SELECT * FROM carlist WHERE carOwner='Akash';";

			Statement s= con.createStatement();

			ResultSet set =s.executeQuery(q);

			while(set.next())
			{
				int id= set.getInt(1);
				String comp =set.getString(2);
				String cname =set.getString(3);
				String ownername =set.getString(4);
				String ownerPhone =set.getString(5);
				String LicenceNum =set.getString(6);

				System.out.println("  Car ID           : "+id);
				System.out.println("  Car Company name : "+comp);
				System.out.println("  Car Name         : "+cname);
				System.out.println("  Car Owner name   : "+ownername);
				System.out.println("  Car Owner Phone  : "+ownerPhone);
				System.out.println("  Car Licence No   : "+LicenceNum);

				System.out.println("_______________________________________________________________");

			}

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	
	
	
}
