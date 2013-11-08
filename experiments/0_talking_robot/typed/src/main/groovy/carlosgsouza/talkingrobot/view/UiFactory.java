package carlosgsouza.talkingrobot.view;

import carlosgsouza.derails.Form;
import carlosgsouza.derails.View;

public class UiFactory {
	
	public View bye(String name) {
		return new View("Bye, $name!");
	}
	
	public Form nameForm() {
		return new Form("My name is Jack Johnson and I am a talking robot. Who are you?", "name");
	}
	
	public View hi(String name) {
		return new View("Hello, $name!");
	}
	
}