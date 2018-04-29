
package builderoffline;


public class BeefBurger implements BurgerBuilder {
    
    private Product newBurger = new Product();

    @Override
    public void setPatty(String patty) {
        newBurger.Add(patty);
    }

    @Override
    public void setSauce(String sauce) {
        newBurger.Add(sauce);
    }

    @Override
    public void setCheese(String cheese) {
        newBurger.Add(cheese);
    }

    @Override
    public Product getProduct() {
        return newBurger;
    }
    
}