package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;
/**
 * @author pedroirivera-vega
 *@author Jose E. Frontanez Rivera (italianassassin3), 843-11-2851, 050
 */
public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object args) {
		IOComponent io = IOComponent.getComponent(); 
		DMComponent dm = (DMComponent) args; 
		String name = io.getInput("Enter the name of the list to remove from: ");
		int posIndex = Integer.parseInt(io.getInput("Enter the index of the element that you want to remove: ")); 
			dm.removeElementFromList(name, posIndex);
	}

}
