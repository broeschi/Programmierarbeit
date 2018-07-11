package datenbank;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.healthmarketscience.jackcess.*;



public class Datenbank {

	  
	  
    /**
     * @param args
     */
    public static void main(String[] args) {
    	    }
    
    /**
     * Verbindung zu MS Access DB aufbauen und Inhalt laden
     * 
     * @author Rudolf Broger
     * @throws Exception
     */
    public static void loadData() throws Exception {
    	ArrayList<String> Adresse = new ArrayList<String>(); 
    	 Database db = DatabaseBuilder.open(new File("C:/Users/Rudolf Broger/Documents/Schützenverwaltung/MSV_be.accdb"));
    	 //Table table = db.getTable("Adressen");
    	 //table.getColumn(null);
    
    	 Connection conn=DriverManager.getConnection(
    	      "jdbc:ucanaccess://C:/Users/Rudolf Broger/Documents/Schützenverwaltung/MSV_be.accdb");
    	Statement s = conn.createStatement();

    	ResultSet rs = s.executeQuery("SELECT adrName, adrVorname, adrGebDat, adrAdresse FROM [tblAdressen]");
    	
    	while (rs.next()) {
    		Adresse.add(rs.getString(1))  ;
    		Adresse.add(rs.getString(2));
    		Adresse.add(rs.getString(3))  ;
    		Adresse.add(rs.getString(4));
    	    //System.out.println(rs.getString(1));

    	}
        	    System.out.println(Adresse);

    }
    
    
    public static void saveData() {
    	// Todo
    }
  }
