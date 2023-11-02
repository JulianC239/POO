/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Julian
 */
public abstract class Costo {
    
    protected double price;
    
    public Costo(double price){
        this.price = price;
    }   
    
    public abstract double getPrice();
}
