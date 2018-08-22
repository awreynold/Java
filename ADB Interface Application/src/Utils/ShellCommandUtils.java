package Utils;

import Constants.ADBCommands;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author awreynold
 */
public class ShellCommandUtils {
    public ShellCommandUtils(){
    }
    
    /**
     * retrieves the list of connected devices and populates the table with the results
     * @param table 
     */
    public static void getConnectedDevices(JTable table){
        ArrayList<String> devices = new ArrayList<>();
        try{
            devices = execute(ADBCommands.ADB + ADBCommands.GETDEVICESCOMMAND); //executes the adb devices command
        }catch(Exception ex){
            
        }
        devices.remove(0); //removes the title output line
        int row=0;
        for(String x : devices){
            table.setValueAt(x, row, 0); //adds the output lines to the table
        }
    }
    
    /**
     * retrieves the list of installed packages and populates the table with the results
     * @param table 
     */
    public static void getInstalledPackages(JTable table){
        ArrayList<String> installedPacks = new ArrayList<>();
        try{
            installedPacks = execute(ADBCommands.ADBSHELL + ADBCommands.LISTPACKAGESCOMMAND);
        }catch(Exception ex){
            
        }
        int row=0;
        for(String x : installedPacks){
            table.setValueAt(x, row, 0); //adds the output lines to the table
        }
    }
    
    /**
     * uninstalls the passed in package and refreshes the list of installed packages
     * @param pID -> package name that is to be uninstalled
     * @param table -> table that holds the list of installed packages
     * @return boolean representing if the uninstall was successful or not
     */
    public static boolean uninstallPackage(String pID, JTable table){
        boolean success = false;
        
        return success;
    }
    
    /**
     * connects a new device with adb
     * @param ip -> String representation of the IP address of the device to connect
     */
    public static void connectDevice(String ip){
        
    }
    
    /**
     * executes the passed in String command through the command line
     * @param command -> String representation of the execute
     * @return ArrayList of Strings to represent the output from the command line execution
     * @throws Exception 
     */
    private static ArrayList<String> execute(String command) throws Exception{
        ArrayList<String> output = new ArrayList<>();
        Process p = Runtime.getRuntime().exec(command);
        p.waitFor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line=null;
        while((line=reader.readLine()) != null){
            output.add(line);
        }
        
        return output;
    }
    
}
