
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bz433
 */
public class Edit_data {
    public Edit_data(String list []){
            try{
            String s ="C:/Users/bz433/Documents/NetBeansProjects/Behnam_zarei/src/data.txt";
            FileWriter filewriter = new FileWriter(s);
            BufferedWriter bufferwriter = new BufferedWriter(filewriter);
            PrintWriter printwriter = new PrintWriter(bufferwriter);
            for (int i  =0;i<mainform.conter_tool();i++){
                 printwriter.println(list[i]);    
            }//end of for
            bufferwriter.close();
        }catch (Exception  e){
            e.printStackTra
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bz433
 */
public class Edit_data {
    public Edit_data(String list []){
            try{
            String s ="C:/Users/bz433/Documents/NetBeansProjects/Behnam_zarei/src/data.txt";
            FileWriter filewriter = new FileWriter(s);
            BufferedWriter bufferwriter = new BufferedWriter(filewriter);
            PrintWriter printwriter = new PrintWriter(bufferwriter);
            for (int i  =0;i<mainform.conter_tool();i++){
                 printwriter.println(list[i]);    
            }//end of for
            bufferwriter.close();
        }catch (Exception  e){
            e.printStackTrace();
        }
    }
}
