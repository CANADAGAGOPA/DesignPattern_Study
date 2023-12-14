package DP04_FactoryPattern.PizzaAbstractFactory.PizzaIngredientFactory;

import DP04_FactoryPattern.PizzaAbstractFactory.Cheese.Cheese;
import DP04_FactoryPattern.PizzaAbstractFactory.Cheese.ReggianoCheese;
import DP04_FactoryPattern.PizzaAbstractFactory.Clams.Clams;
import DP04_FactoryPattern.PizzaAbstractFactory.Clams.FreshClams;
import DP04_FactoryPattern.PizzaAbstractFactory.Dough.Dough;
import DP04_FactoryPattern.PizzaAbstractFactory.Dough.ThinCrustDough;
import DP04_FactoryPattern.PizzaAbstractFactory.Pepperoni.Pepperoni;
import DP04_FactoryPattern.PizzaAbstractFactory.Pepperoni.SlicedPepperoni;
import DP04_FactoryPattern.PizzaAbstractFactory.Sause.MarinaraSauce;
import DP04_FactoryPattern.PizzaAbstractFactory.Sause.Sauce;
import DP04_FactoryPattern.PizzaAbstractFactory.Veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
