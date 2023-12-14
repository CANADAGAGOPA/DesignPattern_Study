package DP04_FactoryPattern.PizzaAbstractFactory.PizzaIngredientFactory;

import DP04_FactoryPattern.PizzaAbstractFactory.Cheese.Cheese;
import DP04_FactoryPattern.PizzaAbstractFactory.Cheese.MozzarellaCheese;
import DP04_FactoryPattern.PizzaAbstractFactory.Clams.Clams;
import DP04_FactoryPattern.PizzaAbstractFactory.Clams.FrozenClams;
import DP04_FactoryPattern.PizzaAbstractFactory.Dough.Dough;
import DP04_FactoryPattern.PizzaAbstractFactory.Dough.ThickCrustDough;
import DP04_FactoryPattern.PizzaAbstractFactory.Pepperoni.Pepperoni;
import DP04_FactoryPattern.PizzaAbstractFactory.Pepperoni.SlicedPepperoni;
import DP04_FactoryPattern.PizzaAbstractFactory.Sause.PlumTomatoSauce;
import DP04_FactoryPattern.PizzaAbstractFactory.Sause.Sauce;
import DP04_FactoryPattern.PizzaAbstractFactory.Veggies.BlackOlives;
import DP04_FactoryPattern.PizzaAbstractFactory.Veggies.Eggplant;
import DP04_FactoryPattern.PizzaAbstractFactory.Veggies.Spinach;
import DP04_FactoryPattern.PizzaAbstractFactory.Veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
