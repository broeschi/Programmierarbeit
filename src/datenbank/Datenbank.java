package datenbank;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.healthmarketscience.jackcess.*;
import Person.Person;
import converter.PersonConverter;



public class Datenbank {

	  
	  
    /**
     * @param args
     */
    public static void main(String[] args) {
    	try {
			loadData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	    }
    
    /**
     * Verbindung zu MS Access DB aufbauen und Inhalt laden
     * 
     * @author Rudolf Broger
     * @throws Exception
     */
    public static Person loadData() throws Exception {

    	ArrayList<Person> adresse = new ArrayList<Person>(); 
    	
    	 //Database db = DatabaseBuilder.open(new File("C:\\Users\\u117089\\OneDrive\\Wirtschaftsinformatik\\FH\\Kalaidos\\Softwareentwicklung_I\\workspace\\Vereinsverwaltung\\MSV_be.accdb"));
    	 Database db = DatabaseBuilder.open(new File("C:/Users/Rudolf Broger/Documents/Schützenverwaltung/MSV_be.accdb"));

    	 Table table = db.getTable("tblAdressen");
		 

		 for(Row row : table) {
			 PersonConverter converter = new PersonConverter();
			Person p = converter.dbToModel(row);
    		return p;
    		 
    	 }
    	 System.out.print(adresse);	 //table.getColumn(null);
    
    	// Connection conn=DriverManager.getConnection(
    	//      "jdbc:ucanaccess://C:/Users/Rudolf Broger/Documents/Schützenverwaltung/MSV_be.accdb");
    	 
    	return (Person) table;
    	     
    }
      
    
    public static void saveData() {
    	// Todo
    }
  }
