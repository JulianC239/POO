/**
 *
 * @author Julian
 */
package View;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import modelView.ItemOper;


public class View {
    Scanner acStr = new Scanner(System.in);
    Scanner acInt = new Scanner(System.in);
    Scanner acDbl = new Scanner(System.in);
    Scanner acLng = new Scanner(System.in);
    
    public void handleItems(){
        int opcion;
        
        do{
            System.out.println("Opciones");
            System.out.println("1. Add item");
            System.out.println("2. Recover item");
            System.out.println("3. Update item");
            System.out.println("4. Delte item");
            System.out.println("5. List item");
            System.out.println("6. exit");
            System.out.println("?");
            opcion = acInt.nextInt();
            switch (opcion) {
                case 1: saveItem(); break;
                case 2: getItem(); break;
                case 3: editItem(); break;
                case 4: removeItem(); break;
                case 5: getItems(); break;
                
                    
                default:
                    throw new AssertionError();
            }
        }while(opcion != 6);
    }
    
    private void saveItem(){
        int op;
        do{
            ItemOper itemOper = new ItemOper();
            System.out.println("Add item".toUpperCase());
            System.out.println("Enter 0 to end or another key to continue : ");
            op = acInt.nextInt();
            
            if(op != 0){
                System.out.println("Ener Item");
                
                Long stock = (long) ( Math.random() + 30);
                
                System.out.println("Item name");
                String name = acStr.nextLine();
                
                System.out.println("Item price");
                Double price = acDbl.nextDouble();
                
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
             
        }while(op != 0);
    }
    
    private void getItem(){
        ItemOper itemOper = new ItemOper();
        System.out.println("Recover item");
        
        System.out.println("Code item");
        String code = acStr.nextLine();
        
        itemOper.recoverItem(code);
    }
    
    private void editItem(){
        
        ItemOper itemOper = new ItemOper();
        System.out.println("Update item");
        
        System.out.println("Code item");
        String code = acStr.nextLine();
        
        System.out.println("Item name");
        String name = acStr.nextLine();
        
        System.out.println("Item price");
        String price = acStr.nextLine();
        
        System.out.println("Item Stock");
        Long stock = acLng.nextLong();
        
        Map<String , Object> items = new HashMap<String, Object>(){
            {
                put(code + "/name", name);
                put(code + "/price", price);
                put(code + "/stock", stock);
               
            }
        };
        
        itemOper.updateItem(code, items);
        
    }
    
    public void removeItem(){
        ItemOper itemOper = new ItemOper();
        System.out.println("Delete item");
        
        System.out.println("Code item");
        String code = acStr.nextLine();
        
        itemOper.deleteItem(code);
    }
    
    private void getItems(){
        ItemOper itemOper = new ItemOper();
        System.out.println("List item");
        itemOper.listItems();
    }
}
