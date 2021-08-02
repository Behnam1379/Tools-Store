
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
public class D_write {
    String txt ;
    public D_write(String txt1){
        this.txt=txt1;
    }
    public void d_write(){
        try{
            String s ="C:/Users/bz433/Documents/NetBeansProjects/Behnam_zarei/src/data.txt";
            FileWriter filewriter = new FileWriter(s,true);
            BufferedWriter bufferwriter = new BufferedWriter(filewriter);
            PrintWriter printwriter = new PrintWriter(bufferwriter);
            printwriter.println(txt);
            bufferwriter.close();
        }catch (Exception  e){
            e.printStackTrace();
        }
    }
}
