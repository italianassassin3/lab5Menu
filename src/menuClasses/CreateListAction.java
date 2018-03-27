package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;
/**
 * @author pedroirivera-vega
 *@author Jose E. Frontanez Rivera (italianassassin3), 843-11-2851, 050
 */
public class CreateListAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nAdding a new list of Integer values to the system:\n"); 
		String listName = io.getInput("\nEnter name of new list: "); 
		dm.addList(listName); 
	}

}
