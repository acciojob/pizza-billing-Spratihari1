package com.driver;

public class DeluxePizza extends Pizza {


    private String bill="";
    private boolean isVeg=true;


    public DeluxePizza(Boolean isVeg) {
       super(isVeg);
       this.isVeg=isVeg;


          //DOUBT
        // your code goes here
        if(isVeg){
            //price 300
            //cheese=80
            //toppings=70
        }
        if(!isVeg){}




    }


    public String getBill(){
        int price=0;
    if(isVeg){

         price=getPrice()+80+70;
        bill="Base Price Of The Pizza: "+price+"\n";
    }
    if(!isVeg){
         price=getPrice()+80+120;

        bill="Base Price Of The Pizza: "+price+"\n";
    }

        if(paper_bag_price>0){
            bill = bill +"\n"+ paperbag + "\n";
        }

        int total=price+paper_bag_price;
        bill=bill+"Total Price: "+total;


        return bill;
    }
@Override
    public void addExtraCheese(){

    }


    public void addExtraToppings(){
        // your code goes here

    }
}
