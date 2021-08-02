
import javax.swing.table.DefaultTableModel;

public  class tabledata {
      DefaultTableModel table = new  DefaultTableModel();
    public tabledata(){
      mainform.jdatatable.setModel(table);
     table.addColumn("Number");
     table.addColumn("Name");
     table.addColumn("Manufactor");
     table.addColumn("Price");
     table.addColumn("Code");
     table.addColumn("number of tools");
        for (int i = 0 ;i<mainform.conter_tool();i++){
            String rowdata=Integer.toString(i+1)+","+mainform.mylist[i];
            String [] list = rowdata.split(",");
            table.addRow(list); 
        }
    }
}
