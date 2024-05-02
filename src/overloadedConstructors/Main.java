package overloadedConstructors;

public class Main {

	public static void main(String[] args) {
		//Overloaded Constructors = multiple constructors within a class with the same name 
		//						   but have different parameters
		//						   name + parameters = signature
		
		
		Pizza pizza = new Pizza("thick crust","tomato","Mozzarella","Pepperoni");//Now we have a pizza object 
		System.out.println("Here are the ingredients of your pizza");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		System.out.println();
		Pizza pizza2 = new Pizza("thick crust","tomato");
		System.out.println("Here are the ingreadients of your second pizza");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
	}
	
}
