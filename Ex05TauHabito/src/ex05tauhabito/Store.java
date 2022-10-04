package ex05tauhabito;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TAU
 */
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String n){
    name = n;
    Item[] itemList = new Item[5];
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public int getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if (index > itemList.size()) {
        System.out.println("There are only " + itemList.size() + "items in the store.");
    }
    else {
        itemList[index].getCost();
        itemList[index].cost += earnings;
        System.out.println("Sold a " + itemList[index].name + ".");
    }
  }
  public void sellItem(String name){
      for (int i = 0; i < itemList.size(); i++) {
      if (itemList[i].name == name) {
          this.getEarnings();
          earnings += itemList[i].cost;
      }
      else {
          System.out.println("The store does not have " + name);
      }
    }
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to getEarnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to getEarnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.println();
    for (int i = 0; i < itemList.size(); i++) {
      if (itemList[i].type == type) {
          System.out.print(itemList[i].name + " ,");
      }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
   System.out.println();
    for (int i = 0; i < itemList.size(); i++) {
      if (itemList[i].cost <= maxCost) {
          System.out.print(itemList[i].name + " ,");
      }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.println();
    for (int i = 0; i < itemList.size(); i++) {
      if (itemList[i].cost >= minCost) {
          System.out.print(itemList[i].name + " ,");
      }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for (int i = 0; i < storeList.size(); i++) {
      System.out.printf("Store name: %s \n" + storeList[i].name);
      System.out.printf("Earnings: %s \n" + storeList[i].earnings);
      System.out.println();
    }

  }
}

