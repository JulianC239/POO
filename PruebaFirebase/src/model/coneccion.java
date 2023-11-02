/**
 *
 * @author Julian
 */
package model;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class coneccion {
    
    
private static FirebaseDatabase firebaseDB = null;

public static FirebaseDatabase getConnection(){
    
    try{
        if(firebaseDB == null){
        FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                .setDatabaseUrl("https://prueba2-9fb51-default-rtdb.firebaseio.com/")
                .setServiceAccount(new FileInputStream(new File("C:\\Users\\Julian\\OneDrive\\Documentos\\NetBeansProjects\\FireBase\\prueba2-9fb51-firebase-adminsdk-7r3xa-4eb2f60997.json")))
                .build();
        
        FirebaseApp.initializeApp(firebaseOptions);
        firebaseDB = FirebaseDatabase.getInstance();
        }
    }catch(FileNotFoundException ex){
        ex.printStackTrace();
    }    
    return firebaseDB;
}



}
