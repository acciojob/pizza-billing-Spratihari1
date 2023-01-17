package com.driver;

public class Main {
  public static void main(String[] args) {

    DeluxePizza dp= new DeluxePizza(true);
    System.out.println(dp.getBill());
    System.out.println("-------------------------------");

    DeluxePizza dp1= new DeluxePizza(false);
    System.out.println(dp1.getBill());


  }
}