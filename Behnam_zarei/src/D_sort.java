

/**
 *
 * @author bz433
 */
public class D_sort {
   
  public String [] sort(){
       String list [] = D_read.readfile();
     // if (mainform.mylist!=null){ 
 for (int i = 0;i<mainform.conter_tool();i++){
      for (int j = 0;j<mainform.conter_tool()-(i+1);j++){
          String t =list[j].split(",")[0];
          String v =list[j+1].split(",")[0];
          if (t.compareToIgnoreCase(v)>0){
              String list1=list[j];
              list[j]=list[j+1];
              list[j+1]=list1;
          }
      }
 }
      
    return list;
 
  }    
  }
