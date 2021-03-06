import java.util.ArrayList;

public class Side extends Order {
    String size;

    ArrayList<String> contain = new ArrayList<String>();

    public Side(String nameType, String size, String itemType){
        super(itemType, nameType);
        this.size = size;
        canBeChanged = true;
        sideList();
    }

    public Side(String nameType, String itemType){
        super(itemType, nameType);
        canBeChanged = true;
        sideList();
    }

    public void sideList(){
        if(nameType.equals("French Fries")) {
            if (size.equals("Small")) {
                price = 1.89;
            } else if (size.equals("Medium")) {
                price = 2.79;
            }else if(size.equals("Large")){
                price = 3.50;
            }
            canBeChanged = true;
        }

        if(nameType.equals("Poutine")) {
            contain.add("Gravy");
            contain.add("Cheese Curds");
            price = 5.69;
            canBeChanged = true;
        }

        if(nameType.equals("Bacon Poutine")) {
            contain.add("Gravy");
            contain.add("Cheese Curds");
            contain.add("Ripped Bacon");
            price = 6.69;
            canBeChanged = true;
        }

        if(nameType.equals("Chilli Cheese Fries")) {
            contain.add("Chilli");
            contain.add("Cheese Sauce");
            contain.add("Shredded Cheese");
            price = 5.69;
            canBeChanged = true;
        }

        if(nameType.equals("Chilli Cheese Nachos")) {
            contain.add("Chilli");
            contain.add("Cheese Sauce");
            contain.add("Nachos");
            price = 2.18;
            canBeChanged = true;
        }

        if(nameType.equals("Chilli")) {
            if (size.equals("Small")) {
                price = 2.18;
            }else{
                price = 3.29;
            }
            canBeChanged = true;
        }

        if(nameType.equals("Caesar Side Salad")){
            contain.add("Crumbled Asiago Cheese");
            contain.add("Bacon bits");
            contain.add("Lettue Blend");
            contain.add("Croutons");
            price = 2.18;
            canBeChanged = true;
        }

        if(nameType.equals("Garden Side Salad")){
            contain.add("Chopped Tomatos");
            contain.add("Shredded Chedder Cheese");
            contain.add("Salad Blend");
            contain.add("Croutons");
            price = 2.18;
            canBeChanged = true;
        }

        if(nameType.equals("Plain Potato")){
            contain.add("Plain Potato");
            price = 2.18;
            canBeChanged = true;
        }

        if(nameType.equals("Sour Cream & Chives Potato")){
            contain.add("Chives");
            contain.add("Sour Cream");
            price = 2.79;
            canBeChanged = true;
        }

        if(nameType.equals("Bacon Cheese Potato")){
            contain.add("Bacon Bits");
            contain.add("Cheese Sauces");
            contain.add("Shredded Cheese");
            price = 3.50;
            canBeChanged = true;
        }

        if(nameType.equals("Chilli Cheese Potato")){
            contain.add("Chilli");
            contain.add("Cheese Sauces");
            contain.add("Shredded Cheese");
            price = 3.50;
            canBeChanged = true;
        }
    }
        public String toString(){
            if(nameType.contentEquals("French Fries") || nameType.contentEquals("Chilli")){
                return size + " " + nameType;
            }else{
                return nameType;
            }
        }
}
