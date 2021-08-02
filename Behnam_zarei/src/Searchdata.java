/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bz433
 */
public class Searchdata {
    public int search(String key){
                      int index = -1;
                    int up1 =mainform.conter_tool();int down1 =0;int m1;
                while (true){
                    m1= (up1+down1)/2;                            //middle
                    String txt = mainform.mylist[m1].split(",")[0];
                    if(txt.compareToIgnoreCase(key)==0){
                        index=m1;
                   break;}
                   else if (up1==down1){                        //end search
                            break;                                     
                        }else
                        if (txt.compareToIgnoreCase(key)>0){
                        up1=m1-1;}
                        else down1= m1+1;
                        }        //          end of while
                return index;
    }
    public int search(int key){
        int key_search=-1;
        for (int i =0;i<mainform.conter_tool();i++){
        String text = mainform.mylist[i].split(",")[3];
        int code = Integer.parseInt(text);
         if (code ==key)
           key_search=i;
    }
        return key_search;
}
}
