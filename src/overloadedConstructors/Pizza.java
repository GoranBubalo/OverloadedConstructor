package overloadedConstructors;

public class Pizza {

	// Global
	String bread;
	String sauce;
	String cheese;
	String topping;

	// Overloaded Constructor
	// DEFINE the constructor
	Pizza(String bread, String sauce, String cheese, String topping) {

		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}

	Pizza(String bread, String sauce, String cheese) {

		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}

	Pizza(String bread, String sauce) {

		this.bread = bread;
		this.sauce = sauce;
	}

	Pizza(String bread) {

		this.bread = bread;
	}

	Pizza() {

	}
}
