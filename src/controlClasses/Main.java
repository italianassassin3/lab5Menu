package controlClasses;

import java.util.Stack;

import dataManager.DMComponent;
import menuClasses.MainMenu;
import menuClasses.Menu;
import menuClasses.Option;
/**
 * 
 *@author pedroirivera-vega
 *@author Jose E. Frontanez Rivera (italianassassin3), 843-11-2851, 050
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DMComponent dm = new DMComponent(); 
		Stack<Menu> mStack = dm.getMenuStack();  
		mStack.push(MainMenu.getMainMenu()); 
		while(!mStack.empty()) {
			Option opt = mStack.peek().activate(); 
			opt.getAction().execute(dm); 
		} 
		
	}
}
