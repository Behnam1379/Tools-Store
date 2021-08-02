
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bz433
 */
public class D_read {
    public static String [] readfile(){
        String mylist [] = new String[100];
        try{
            String read = "C:/Users/bz433/Documents/NetBeansProjects/Behnam_zarei/src/data.txt";
            File file = new File(read);
            FileReader reader = new FileReader(file);
            BufferedReader buffer =new BufferedReader(reader);
            int count=0 ;
            String line;
            while ((line=buffer.readLine())!=null){
                mylist[count]=line;
                count++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return mylist;
    }
}
