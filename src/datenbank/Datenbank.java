package datenbank;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.healthmarketscience.jackcess.*;
import com.sun.rowset.internal.Row;

import GUI.PersonController;
import Person.Person;
import converter.PersonConverter;


public class Datenbank {
    /**
     * @param args
     */
    public static void main(String[] args) {
    	MainApp.main(null);
    	
    }


	  
	  
   
    /**
     * Verbindung zu MS Access DB aufbauen und Inhalt laden
     * 
     * @author Rudolf Broger
     * @throws Exception
     */
    public static Person loadData() throws Exception {

    	ArrayList<Person> adresse = new ArrayList<Person>(); 
    	
    	 Database db = DatabaseBuilder.open(new File("C:/Users/Rudolf Broger/Documents/Schützenverwaltung/MSV_be.accdb"));
    	 Table table = db.getTable("tblAdressen");
		 PersonConverter converter = new PersonConverter();

    	 for (com.healthmarketscience.jackcess.Row row : table) {
			Person p = converter.dbToModel(row);
    		return (Person) p;
    		 
    	 }
    	 
    
    	
    	 
    	return (Person) table;
    	     
    }
    
    
      
    
    public static void saveData() {
    	// Todo
    }
  }
