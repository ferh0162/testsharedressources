package com.company;

public class Catalogue {

  private Item[] items;
  private int counter = 0;


  // Hvis Catalogue size er 10, så skal der oprettes et array på 10 pladsder
  public Catalogue(int size){
    items = new Item[size];

  }
// Vi skal sætte items inde i arrayet Catalague
  public void addItem(Item objekt) {
  items[counter] = objekt;
  counter++;
  }


}
