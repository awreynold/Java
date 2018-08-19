package Utils;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author awreynold
 */
public class TableUtils{
    
    public TableUtils(){
    }
    
    /**
     * loops thru the table to find the next empty row. if no empty row is found
     * then the increaseRowCount method is called to add an additional row to the
     * table. after this we loop thru the table again to get the next empty row.
     * after this we should have the next empty row, so then we add the passed in
     * value to the next empty row on the passed in table.
     * @param table -> JTable that holds the information
     * @param value -> String value that should be added to the table
     */
    public static void add(JTable table, String value){
        int row = getNextEmptyRow((table));
        if(row == -1){
            increaseRowCount(table);
            row = getNextEmptyRow(table);
        }
        
        table.setValueAt(value, row, 0);
    }
    
    /**
     * searches the passed in table for the passed in value. once the value is found
     * the array holding the row and column of the value are returned. if the value 
     * is not found in the table then -1/-1 are returned as the arrays values
     * @param table -> JTable that holds the information
     * @param value -> String value to be searched for
     * @return int array that contains the row and column numbers of the value
     */
    public static int[] search(JTable table, String value){
        int[] rowColumn = new int[]{-1,-1};
        
        for(int x=0; x<table.getRowCount(); x++){
            for(int y=0; y<table.getColumnCount(); y++){
                if(table.getValueAt(x, y).equals(value)){
                    rowColumn[0] = x;
                    rowColumn[1] = y;
                    return rowColumn;
                }
            }
        }
        
        return rowColumn;
    }

    /**
     * gets the string representation of the value at the selected row/column combination
     * from the passed in table
     * @param table -> JTable that holds the information
     * @return String representation of the value held at the selected row/column
     */
    public static String getSelectedValue(JTable table){
         return table.getModel().getValueAt(table.getSelectedRow(), table.getSelectedColumn()).toString();
    }
    
    /**
     * logic to remove the passed in row from the passed in table
     * @param table -> JTable that holds the information
     * @param row -> int value that represents what row to remove
     */
    public static void remove(JTable table, int row){
        DefaultTableModel tModel = (DefaultTableModel)table.getModel();
        tModel.removeRow(row);
    }
    
    /**
     * returns a String representation of all the values in the passed in table
     * @param table
     * @return 
     */
    public static String toString(JTable table){
        String output = "";
        
        for(int x=0; x<table.getRowCount(); x++){
            for(int y=0; y<table.getColumnCount(); y++){
                output += table.getValueAt(x, y) + ",";
            }
            output += "\n";
        }
        
        return output;
    }
    
    /**
     * loops through the tables rows and checks for the first blank row. once 
     * the next blank row is found, this returns the row value in the form of an 
     * int. if no blank row is found then this will return -1
     * @param table -> JTable that holds the information
     * @return int value representing the next empty row in the passed in table
     */
    private static int getNextEmptyRow(JTable table){
        int rowCount = ((DefaultTableModel)table.getModel()).getRowCount();
        for(int x=0; x<rowCount; x++){
            if(table.getValueAt(x, 0) == null)
                return x;
        }
        return -1;
    }
    
    /**
     * checks the passed in tables rowCount against the row that is passed in
     * if the rowCount is not less than the row value, this increases the rowCount
     * by 1. This should mean that there is always a row avaliable in the table to be
     * used.
     * @param table -> JTable that holds the information
     * @param row -> row that is having values added to it currently
     */
    private static void increaseRowCount(JTable table, int row){
        DefaultTableModel tModel = (DefaultTableModel)table.getModel();
        int rowCount = ((DefaultTableModel)table.getModel()).getRowCount();
        if(!(rowCount < row))
            increaseRowCount(table);
    }
    
    /**
     * increases the rowCount property of the passed in table
     * @param table -> JTable that holds the information
     */
    private static void increaseRowCount(JTable table){
        DefaultTableModel tModel = (DefaultTableModel)table.getModel();
        tModel.setRowCount(tModel.getRowCount() + 1);
    }
}
