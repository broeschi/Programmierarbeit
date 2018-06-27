package datenbank;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.healthmarketscience.jackcess.*;
import com.sun.rowset.internal.Row;



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
    	 Table table = db.getTable("Adressen");
    	 //table.getColumn(null);
    	 for (Row row : table) {
    		 
    	 }
    
        	    System.out.println(Adresse);

    }
    
    
    public static void saveData() {
    	// Todo
    }
  }
