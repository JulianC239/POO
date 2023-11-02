/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Julian
 */
public class Item extends Costo  {
    private String name;
    private Long stock;
    
    public Item(String name, Double price, Long stock){
        super(price);
        this.name = name;  
        this.stock= stock;       
    }
    public Long getStock(){
        return stock;
    }
    public void setStock(Long stock){
        this.stock = stock;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(Double price){
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
    
}

