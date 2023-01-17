package com.driver;

public class Pizza {

    private String pricestring="";
    private int price;
    private Boolean isVeg;
    private String bill;


    protected int extraCheese=0;
 private    String excheese="";

    protected int extratoppingsprice =0;
    String extoppings="";

    protected int paper_bag_price=0;
    protected String paperbag="";


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            pricestring="Base Price Of The Pizza: "+getPrice();
        }
        if(!isVeg){
            pricestring="Base Price Of The Pizza: "+getPrice();
        }

    }

    public int getPrice(){
        if(isVeg){
            return this.price=300;
        }

        return this.price=400;

    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese=80;
        excheese= "Extra Cheese Added: "+extraCheese;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            extratoppingsprice =70;
            extoppings="Extra Toppings Added: "+ extratoppingsprice;
        }
       else {
            extratoppingsprice =120;
            extoppings="Extra Toppings Added: "+ extratoppingsprice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        paper_bag_price=20;
        paperbag="Paperbag Added: "+paper_bag_price;
    }

    public String getBill(){
        // your code goes here
        bill=pricestring+"\n";

       if(extraCheese>0) {
            bill = bill + excheese+"\n";
        }

        if(extratoppingsprice>0){
            bill = bill + extoppings + "\n";
        }

        if(paper_bag_price>0){
            bill = bill + paperbag + "\n";
        }
        int total=paper_bag_price+extratoppingsprice+extraCheese+price;
        bill=bill+"Total Price: "+total;




        return bill;
    }
}
