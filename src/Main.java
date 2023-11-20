public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        PizzaBuilder margheritaPizzaBuilder = new MargheritaPizzaBuilder();
        waiter.setPizzaBuilder(margheritaPizzaBuilder);

        waiter.constructPizza();
        Pizza margheritaPizza = waiter.getPizza();
        System.out.println("Margherita Pizza: " + margheritaPizza);
    }
}