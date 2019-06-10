public class Drink extends Order {
    String drinkType;
    String name;
    String size;
    boolean ice;


    public Drink(String drinkType, String size, boolean ice, String name, String itemType){
        super(itemType);
        this.drinkType = drinkType;
        this.size = size;
        this.ice = ice;
        this.name = name;
        typeOfDrink();
    }

    public Drink(String drinkType, String name, String itemType){ // For packaged Drinks/Hot Drinks
        super(itemType);
        this.drinkType = drinkType;
        this.name = name;
        typeOfDrink();
    }

    public void typeOfDrink(){
        if(drinkType.equals("Soda")){
            if(size.equals("Kids")){
                price = 0.1;
            }else if(size.equals("Value")){ // Also considered a senior drink
                price = 0.1;
            }else if(size.equals("Small")){
                price = 1;
            }else if(size.equals("Medium")){
                price = 0.1;
            }else if(size.equals("Large")){
                price = 0.1;
            }
        }

        if(drinkType.equals("Water")){
            price = 0.1;
        }

        if(drinkType.equals("Hot Drink")){
            price = 0.1; //Only comes in one size
        }

        if(drinkType.equals("Milk")){
            price = 0.1; // One Size
        }
        //^^ Also Packaged, but holds a different price, look into revamp this later on
        if(drinkType.equals("Packaged Drink")){
            price = 0.01; // One Size
        }

        if(drinkType.equals("Lemonade")){
            if(size.equals("Kids")){
                price = 0.1;
            }else if(size.equals("Value")){ // Also considered a senior drink
                price = 0.1;
            }else if(size.equals("Small")){
                price = 0.1;
            }else if(size.equals("Medium")){
                price = 0.1;
            }else if(size.equals("Large")){
                price = 0.1;
            }
        }
    }
    public String toString(){
        return size + " " + name;
    }
}