package DP04_FactoryPattern.PizzaAbstractFactory.PizzaIngredientFactory;

import DP04_FactoryPattern.PizzaAbstractFactory.Cheese.Cheese;
import DP04_FactoryPattern.PizzaAbstractFactory.Clams.Clams;
import DP04_FactoryPattern.PizzaAbstractFactory.Dough.Dough;
import DP04_FactoryPattern.PizzaAbstractFactory.Pepperoni.Pepperoni;
import DP04_FactoryPattern.PizzaAbstractFactory.Sause.Sauce;
import DP04_FactoryPattern.PizzaAbstractFactory.Veggies.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
