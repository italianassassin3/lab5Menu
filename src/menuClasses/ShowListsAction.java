package menuClasses;

import dataManager.DMComponent;
/**
 * 
 *@author pedroirivera-vega
 *@author Jose E. Frontanez Rivera (italianassassin3), 843-11-2851, 050
 *
 */
public
public class ShowListsAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		dm.showListsNames(); 
	}

}
