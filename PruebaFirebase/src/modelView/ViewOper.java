/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelView;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Julian
 */
public class ViewOper {
    
    
public void saveItem(String name, Double price){
    
    ItemOper itemOper = new ItemOper();
    Long stock = (long) ( Math.random() + 30);
    String id = (String) UUID.randomUUID().toString().subSequence(0, 6);
    
    Map<String , Object> items = new HashMap<String , Object>(){
                    {
                    put("name", name);
                    put("price", price);
                    put("stock", stock);
                    }
                };
                
    itemOper.saveItem(id, items);
    System.out.println("Item saved succesusfully");   
    
}

public void getItem(String code){
    
    ItemOper itemOper = new ItemOper();
    
    itemOper.recoverItem(code);
    
}
    

public void editItem(String code, String name, String price, Long stock){
    
    ItemOper itemOper = new ItemOper();
    
    Map<String , Object> items = new HashMap<String, Object>(){
            {
                put(code + "/name", name);
                put(code + "/price", price);
                put(code + "/stock", stock);
               
            }
        };
    
    itemOper.updateItem(code, items);
    
}
public void deleteItem(String id){
    
    ItemOper itemOper = new ItemOper();
    
    itemOper.deleteItem(id);
}

public void getItems(){
        ItemOper itemOper = new ItemOper();
        itemOper.listItems();
    }


}
