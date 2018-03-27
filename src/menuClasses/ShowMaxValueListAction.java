package menuClasses;

import ioManagementClasses.IOComponent;
import dataManager.DMComponent;
/**
 * 
 *@author pedroirivera-vega
 *@author Jose E. Frontanez Rivera (italianassassin3), 843-11-2851, 050
 *
 */
public class ShowMaxValueListAction implements Action {

	@Override
	public void execute(Object arg) {
		IOComponent io = IOComponent.getComponent(); 
		DMComponent dm = (DMComponent) arg; 
		String name = io.getInput("Enter the name of the list to determine its max value: ");
		dm.showMaxValueInList(name); 
	}

}
