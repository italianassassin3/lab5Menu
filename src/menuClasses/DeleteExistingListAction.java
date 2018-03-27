package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;
/**
 * @author pedroirivera-vega
 *@author Jose E. Frontanez Rivera (italianassassin3), 843-11-2851, 050
 */
public class DeleteExistingListAction implements Action {

	@Override
	public void execute(Object args) {
		DMComponent dm = (DMComponent) args; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nRemoving a list from the menu:\n");
		String name = io.getInput("\nEnter the name of the list to remove:\n");;
		dm.deleteList(name);

	}

}
