package com.Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class AdminDBUtil {

	//DETA INSERT TO DB
	private static boolean isSuccess;
	private static Connection con =null;
	private static Statement stmt =null;
	private static ResultSet rs =null;

	public static List<Admin> validate(String name,String nic){
		
		ArrayList<Admin> adm = new ArrayList<>();
		
		//Create DB  Connection
		String url ="jdbc:mysql://127.0.0.1:3306/vpack";
		String user = "root";
	    String pass = "1234";
		//Validate
		try {
			//DB CONNECTION
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			
			//SQL QUERY
			//SQL QUERY
			String sql = "select * from admin where name='"+name+"' and nic='"+nic+"'";

			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String Name = rs.getString(2);
				String Nic = rs.getString(3);
				String phone = rs.getString(4);
				String address = rs.getString(5);
				
				Admin a = new Admin(id,Name,Nic,phone,address);
				adm.add(a);

			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return adm;
	}
	
	//InsertData
	public static boolean insertadmin(String name,String nic,String phone, String address) {
		
		boolean isSuccess = false;
		
		
	    
	    try {
	    	//DB CONNECTION
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			
			//SQL QUERY
			String sql ="insert into admin values (0,'"+name+"','"+nic+"','"+phone+"','"+address+"')";

			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}

	    }catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	//updateData
	public static boolean updateAdmin(String id, String name,String nic,String phone, String address){
		
		try {
			
			//DB CONNECTION
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "update admin set name='"+name+"',nic='"+nic+"',phone='"+phone+"',address='"+address+"'"+ 
			"where id='"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}

			
		}catch(Exception e) {
			e.printStackTrace();
		}
	return isSuccess;
	}
	

	public static List<Admin> getAdminDetails(String Id){
		
		int convertedID =	Integer.parseInt(Id);
		
		ArrayList<Admin> adm = new ArrayList<>();
		
		try {
			
			//DB CONNECTION
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			
			String sql = "select * from admin where id='"+convertedID+"'";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String nic = rs.getString(3);
				String phone = rs.getString(4);
				String address = rs.getString(5);
				
				Admin a = new Admin(id,name,nic,phone,address);
				adm.add(a);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return adm;
		
	}
	public static boolean deleteAdmin(String id){
		
		int convID = Integer.parseInt(id);
		
			try {
			
			//DB CONNECTION
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			
			String sql = "delete from admin where id='"+convID+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
		
	}	
	
	
	public static List<Admin> getAllAdmins() {
	    ArrayList<Admin> admins = new ArrayList<>();
	    
	    try {
	        // DB CONNECTION
	        con = DBConnect.getConnection();
	        stmt = con.createStatement();
	        
	        String sql = "select * from admin";
	        rs = stmt.executeQuery(sql);
	        
	        while (rs.next()) {
	            int id = rs.getInt(1);
	            String name = rs.getString(2);
	            String nic = rs.getString(3);
	            String phone = rs.getString(4);
	            String address = rs.getString(5);
	            
	            Admin a = new Admin(id, name, nic, phone, address);
	            admins.add(a);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return admins;
	}

	//----------------------------------------------FILM-------------------------------------------------------
	
	//validate
	public static List<Film> filmvalidate(String filmname, String filtype) {
	    ArrayList<Film> films = new ArrayList<>();

	    // Create DB Connection
	    String url = "jdbc:mysql://127.0.0.1:3306/vpack";
	    String user = "root";
	    String pass = "1234";
	    
	    try {
	        // DB CONNECTION
	        con = DBConnect.getConnection();
	        stmt = con.createStatement();

	        // SQL QUERY
	        String sql = "select * from film where filmname='" + filmname + "' and filtype='" + filtype + "'";

	        ResultSet rs = stmt.executeQuery(sql);

	        while (rs.next()) {
	            int filmid = rs.getInt(1);
	            String Filmname = rs.getString(2);
	            String Filtype = rs.getString(3);
	            String filmtime = rs.getString(4);
	            String filmdate = rs.getString(5);
	            String filmurl = rs.getString(6);
	            String filmdescription = rs.getString(7);

	            Film m = new Film(filmid, Filmname, Filtype, filmtime, filmdate, filmurl, filmdescription);
	            films.add(m);
	        }
	    }catch (Exception e) {
	        e.printStackTrace(); // Log the exception for debugging
	    }
	    return films;
	}

	
	public static List<Film> getAllFilms() {
	    ArrayList<Film> films = new ArrayList<>();
	    
	    try {
	        // DB CONNECTION
	        con = DBConnect.getConnection();
	        stmt = con.createStatement();
	        
	        String sql = "select * from film";
	        rs = stmt.executeQuery(sql);
	        
	        while (rs.next()) {
				int filmid = rs.getInt(1);
				String Filmname = rs.getString(2);
				String Filtype = rs.getString(3);
				String filmtime = rs.getString(4);
				String filmdate = rs.getString(5);
				String filmurl = rs.getString(6);
				String filmdescription = rs.getString(7);
				
				Film m = new Film(filmid,Filmname,Filtype,filmtime,filmdate,filmurl,filmdescription);
				films.add(m);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return films;
	}
	//InsertData
	public static boolean insertfilm(String filmname,String filtype,String filmtime, String filmdate, String filmurl, String filmdescription) {
		
		boolean isSuccess = false;
		
		
	    
	    try {
	    	//DB CONNECTION
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			
			//SQL QUERY
			String sql ="insert into film values (0,'"+filmname+"','"+filtype+"','"+filmtime+"','"+filmdate+"','"+filmurl+"','"+filmdescription+"')";

			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}

	    }catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//updateData
		public static boolean updateFilm(String filmid,String filmname,String filtype,String filmtime, String filmdate, String filmurl, String filmdescription) {
			
			try {
				    
				//DB CONNECTION
				con =DBConnect.getConnection();
				stmt=con.createStatement();
				String sql = "update film set filmid='"+filmid+"',filmname='"+filmname+"',filtype='"+filtype+"',filmtime='"+filmtime+"',filmdate='"+filmdate+"',filmurl='"+filmurl+"',filmdescription='"+filmdescription+"'"+ 
				"where filmid='"+filmid+"'";
				
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
				}
				else {
					isSuccess = false;
				}

				
			}catch(Exception e) {
				e.printStackTrace();
			}
		return isSuccess;
		}
	
		public static List<Film> getFilmDetails(String filmId){
			
			int convertedID = Integer.parseInt(filmId);
			
			ArrayList<Film> film = new ArrayList<>();
			
			try {
				
				//DB CONNECTION
				con =DBConnect.getConnection();
				stmt=con.createStatement();
				
				String sql = "select * from film where filmid='"+convertedID+"'";
				
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int filmid = rs.getInt(1);
					String filmname = rs.getString(2);
					String filtype = rs.getString(3);
					String filmtime = rs.getString(4);
					String filmdate = rs.getString(5);
					String filmurl = rs.getString(6);
					String filmdescription = rs.getString(7);
					
					Film m = new Film(filmid,filmname,filtype,filmtime,filmdate,filmurl,filmdescription);
					film.add(m);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return film;
			
		}
		
		public static boolean deleteFilm(String filmid){
			
			int convID = Integer.parseInt(filmid);
			
				try {
				
				//DB CONNECTION
				con =DBConnect.getConnection();
				stmt=con.createStatement();
				
				String sql = "delete from film where filmid='"+convID+"'";
				
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
				}
				else {
					isSuccess = false;
				}

				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return isSuccess;
			
			
		}	
}
