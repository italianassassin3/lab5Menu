package menuClasses;

import java.util.ArrayList;
/**
 * @author pedroirivera-vega
 *@author Jose E. Frontanez Rivera (italianassassin3), 843-11-2851, 050
 */
public class AlterListsMenu extends Menu{
	private static AlterListsMenu ALM = new AlterListsMenu(); 
	private AlterListsMenu() { 
		super(); 
		String title; 
		ArrayList<Option> options = new ArrayList<Option>();  
		title = "Alter Lists Menu"; 
		options.add(new Option("Add a New Value to a List", new AddToListAction())); 
		options.add(new Option("Delete Position from a List", new DeleteFromListAction())); 
		options.add(new Option("Show Content of a List", new ShowListAction())); 
		
		options.add(Option.EXIT); 

		super.InitializeMenu(title, options); 

	}
	
	public static AlterListsMenu getAlterListsMenu() { 
		return ALM; 
	}
}
