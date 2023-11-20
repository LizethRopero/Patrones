public class MargheritaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public MargheritaPizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("thin crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("tomato");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("mozzarella cheese");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}

