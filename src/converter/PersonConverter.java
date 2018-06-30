package converter;

import com.healthmarketscience.jackcess.Row;

import Person.Person;
 

public class PersonConverter {
	/**
	 * Personendaten umwandeln für Anzeige im GUI
	 * 
	 * @param row
	 * @return
	 */

	public Person dbToModel(Row row) {
		
		Person p = new Person("adrName", "adrVorname", null, null, null, null, null);
		String name = (String) row.get("adrName");
		String vorname = (String) row.get("adrVorname");
		p.setAdrName(name);
		p.setAdrName(vorname);
		return p;
	}

}
