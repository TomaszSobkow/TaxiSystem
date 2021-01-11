import javax.swing.*;

public class Fare {

    Fare(){}

     void menuControl(){
        String menuControl = JOptionPane.showInputDialog(null,"********** Welcome at Taxi SYSTEM **********"+
                                    "\n\n        1. NEW Fare \t\t " + "\n        2.  Check Active Fares"+
                                    "\n        3.  Print Drivers\t    " + "\n        4.  Print Vehicles"+
                                    "\n\nQ.  Close Program"+"\n\n");
        switch (menuControl.toLowerCase()){
            case "1":
                break;
            case "2":
                break;
            case "3":
                new  Driver().printDrivers();
                menuControl();
                break;
            case "4":
                new Vehicles().printVehicles();
                menuControl();
                break;
            case "q":
                int selectedValue = JOptionPane.showConfirmDialog(null,"Do you want to close the program ",
                                   "",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
                if(selectedValue == 0){
                    System.exit(0);
                }
                else
                    menuControl();
                break;
            default:
                JOptionPane.showMessageDialog(null,"        Invalid character entered ! \nPlease enter valid character from MENU",
                        "Data Input Error",JOptionPane.ERROR_MESSAGE);
                menuControl();
        }


    }

}
