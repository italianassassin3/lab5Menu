package menuClasses;

/**
 * Defines the types of options that a menu contains. An object
 * of this type contains a description string (wht the menu displays
 * corresponding to that particular option) and an associated 
 * action (another object, of type Action)
 * @author pedroirivera-vega
 *@author Jose E. Frontanez Rivera (italianassassin3), 843-11-2851, 050
 */
public class Option {
	public static final Option EXIT = 
			new Option("Exit", new ExitAction()); 
	private String description; 
	private Action action; 
	
	public Option(String description, Action action) { 
		this.description = description; 
		this.action = action; 
	}

	public String getDescription() {
		return description;
	}

	public Action getAction() {
		return action;
	}

}
