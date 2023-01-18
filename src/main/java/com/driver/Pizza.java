package com.driver;

public class Pizza {

    private String pricestring="";
    private int price;
    private Boolean isVeg;
    private String bill;
    private int total;



    protected int extracheeseprice =0;
 private    String excheese="";

    protected int extratoppingsprice =0;
    String extoppings="";

    protected int paper_bag_price=0;
    protected String paperbag="";


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price =300;
            pricestring="Base Price Of The Pizza: "+ price;
        }
        if(!isVeg){
            price =400;
            pricestring="Base Price Of The Pizza: "+ price;
        }
           total= price;

    }


    public int getPrice(){
        if(isVeg){
          //  total=price;
         //   System.out.println(total+" "+ price);
          //  System.out.println(paper_bag_price);

            return price + extracheeseprice +extratoppingsprice+paper_bag_price;
        }


        else   return price + extracheeseprice +extratoppingsprice+paper_bag_price;

    }

    public void addExtraCheese(){
        // your code goes here
        extracheeseprice =80;

        excheese= "Extra Cheese Added: "+ extracheeseprice;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            extratoppingsprice =70;
          //  price=price+extratoppingsprice;
            extoppings="Extra Toppings Added: "+ extratoppingsprice;
        }
       else {
            extratoppingsprice =120;
           // price=price+extratoppingsprice;
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

       if(extracheeseprice >0) {
            bill = bill + excheese+"\n";
        }

        if(extratoppingsprice>0){
            bill = bill + extoppings + "\n";
        }

        if(paper_bag_price>0){
            bill = bill + paperbag + "\n";
        }
         total=paper_bag_price+extratoppingsprice+ extracheeseprice + price;
        bill=bill+"Total Price: "+total;




        return bill;
    }

}
