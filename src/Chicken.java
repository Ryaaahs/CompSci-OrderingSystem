import java.util.ArrayList;

public class Chicken extends Order {
    //Chicken label
    boolean canCombo;
    String bunType;

    //Use if there a Sandwitch related with the order
    ArrayList<String> crown = new ArrayList<String>();
    ArrayList<String> base = new ArrayList<String>();
    ArrayList<String> item = new ArrayList<String>();


    public Chicken(String nameType, String itemType) {
        super(itemType, nameType);
        //this.nameType = nameType;
        chickenList();
    }


    public void chickenList(){
        if(nameType.equals("Spicy Chicken")){
            bunType = "Premium";
            canCombo = true;
            price = 5.09;
            //Crown
            crown.add("Mayo");
            crown.add("Tomato");
            crown.add("Iceberg Lettue");
            //Base
            base.add("Spicy Chicken Breast");
            canBeChanged = true;

        }

        if(nameType.equals("Homestyle Chicken")){
            bunType = "Premium";
            canCombo = true;
            price = 5.09;
            //Crown
            crown.add("Mayo");
            crown.add("Tomato");
            crown.add("Iceberg Lettue");
            //Base
            base.add("Homestyle Chicken Breast");
            canBeChanged = true;

        }

        if(nameType.equals("Grilled Chicken")){
            bunType = "Premium";
            canCombo = true;
            price = 5.09;
            //Crown
            crown.add("Honey Mustard");
            crown.add("Tomato");
            crown.add("Spring Mix Lettue");
            //Base
            base.add("Grilled Chicken Breast");
            canBeChanged = true;

        }

        if(nameType.equals("Spicy Asiago Ranch Club")){
            bunType = "Premium";
            canCombo = true;
            price = 6.19;
            //Crown
            crown.add("Mayo");
            crown.add("Tomato");
            crown.add("Iceberg Lettue");
            //Base
            base.add("Spicy Chicken Breast");
            base.add("Asiago Cheese");
            base.add("3 Pieces of bacon");
            canBeChanged = true;

        }

        if(nameType.equals("Homestyle Asiago Ranch Club")){
            bunType = "Premium";
            canCombo = true;
            price = 6.19;
            //Crown
            crown.add("Ranch");
            crown.add("Tomato");
            crown.add("Iceberg Lettue");
            //Base
            base.add("Homestyle Chicken Breast");
            base.add("Asiago Cheese");
            base.add("3 Pieces of bacon");
            canBeChanged = true;

        }

        if(nameType.equals("Grilled Asiago Ranch Club")){
            bunType = "Premium";
            canCombo = true;
            price = 6.19;
            //Crown
            crown.add("Honey Mustard");
            crown.add("Tomato");
            crown.add("Spring Mix Lettue");
            //Base
            base.add("Grilled Chicken Breast");
            base.add("Asiago Cheese");
            base.add("3 Pieces of bacon");
            canBeChanged = true;

        }

        if(nameType.equals("5 Piece Chicken Nugget")){
            bunType = "Null";
            canCombo = false;
            price = 1.89;
            canBeChanged = true;
            //Add Suace to the order
        }

        if(nameType.equals("10 Piece Chicken Nugget")){
            bunType = "Null";
            canCombo = true;
            price = 3.68;
            canBeChanged = true;
            //Item

            //Add Suace to the order
        }

        if(nameType.equals("Homestyle Chicken Strips")){
            bunType = "Null";
            canCombo = true;
            price = 3.86;
            canBeChanged = true;
            //Item
            //Add Suace to the order
        }

        if(nameType.equals("Spicy Chicken Strips")){
            bunType = "Null";
            canCombo = true;
            price = 3.86;
            canBeChanged = true;
            //Item
            //Add Suace to the order
        }

        if(nameType.equals("Grilled Chicken Wrap")){
            bunType = "Wrap";
            canCombo = false;
            price = 2.18;
            //Base
            base.add("Honey Mustard");
            base.add("Shredded Cheese");
            base.add("Chopped Iceburg Lettue");
            base.add("Half a Grilled Chicken");
            canBeChanged = true;
        }

        if(nameType.equals("Spicy Chicken Wrap")){
            bunType = "Wrap";
            canCombo = false;
            price = 2.18;
            //Base
            base.add("Ranch Sauce");
            base.add("Shredded Cheese");
            base.add("Chopped Iceburg Lettue");
            base.add("Half a Spicy Chicken");
            canBeChanged = true;
        }

        if(nameType.equals("Homestyle Chicken Wrap")){
            bunType = "Wrap";
            canCombo = false;
            price = 2.18;
            //Base
            base.add("Ranch Sauce");
            base.add("Shredded Cheese");
            base.add("Chopped Iceburg Lettue");
            base.add("Half a Homestyle Chicken");
            canBeChanged = true;
        }
    }

    public String toString(){
        if(nameType.contentEquals("5 Piece Chicken Nugget") || nameType.contentEquals("10 Piece Chicken Nugget")){
            return nameType + itemLoop();

        }else if(nameType.contentEquals("Homestyle Chicken Strips") || nameType.contentEquals("Spicy Chicken Strips")){
            return nameType + itemLoop();
        }else{
            return nameType;
        }

    }

    public String itemLoop(){
        String list = "";
        for(int i = 0; i < item.size(); i++){
             list = list + "\n" + "    " + item.get(i);
        }
        return list;
    }
}
