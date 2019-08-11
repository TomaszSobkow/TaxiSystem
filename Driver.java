import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    private String driverName, licenceType, driverAddres, driverID, driverAvailability, monthAsString;
    private int day, month, year;
    private float kilometers, driverTotalIncome, driverKilometersDriven;


    public Driver(String driverID, String driverName, String driverAddress, float kilometers, int day, int month,
                  int year, String licenceType, String driverAvailability, float driverTotalIncome, float driverKilometersDriven) {
        this.driverName = driverName;
        this.licenceType = licenceType;
        this.driverAddres = driverAddress;
        this.driverID = driverID;
        this.driverAvailability = driverAvailability;
        this.day = day;
        this.month = month;
        this.year = year;
        this.kilometers = kilometers;
        this.driverTotalIncome = driverTotalIncome;
        this.driverKilometersDriven = driverKilometersDriven;
    }

    public Driver(){
        driversInArray();
    }

    String getDriverAvailability(){return driverAvailability;}
    String getLicenseType(){return licenceType;}
    String getDriverID(){return driverID;}
    String getDriverName(){return driverName;}
    float getDriverKilometersDriven(){return driverKilometersDriven;}
    float getDriverTotalIncome(){return driverTotalIncome;}
    float getDriverTotalKilometresDriven(){return driverKilometersDriven;}

    void setAvilability(String driverAvailability){this.driverAvailability = driverAvailability;}
    void setKilometres(float driverKilometersDriven){this.driverKilometersDriven = driverKilometersDriven;}
    void setDriverTotalAmount(float driverTotalIncome){this.driverTotalIncome = driverTotalIncome;}
    void setDriverTotalKilometresDriven(float driverKilometersDriven){this.driverKilometersDriven = driverKilometersDriven;}

    Driver tom;
    Driver anne;
    Driver james;
    Driver mary;
    Driver brendan;
    Driver vincent;

    ArrayList<Driver> driversArray = new ArrayList<>();

    void driversInArray() {

         tom = new Driver("1234567A", "Tom", "14 Green St.,Cork", 23231, 12, 8, 2008, "B", "Free", 0, 0);
         anne = new Driver("2345678B", "Annie O'Brien", "\"Beach View\", Kinsale", 11982, 9, 12, 2011, "D", "Free", 0, 0);
         james = new Driver("3456789B", "James Twomey", "14, French St., Cork", 18414, 14, 11, 2010, "D1", "Free", 0, 0);
         mary = new Driver("4567890C", "Mary O'Neill", "23 Castle Road, Youghal", 12669, 11, 2, 2014, "B", "Free", 0, 0);
         brendan = new Driver("5678901D", "Brendan Brown", "98 Nuns Walk, Cork", 23864, 1, 4, 2007, "D", "Free", 0, 0);
         vincent = new Driver("6789012E", "Vincent Coy", "\"Green Valley\", Cobh", 34196, 3, 4, 1998, "D1", "Free", 0, 0);

        driversArray.add(tom);
        driversArray.add(anne);
        driversArray.add(james);
        driversArray.add(mary);
        driversArray.add(brendan);
        driversArray.add(vincent);
   }

   Scanner input = new Scanner(System.in);
   void addNewDriver(){
       boolean driverIdBoolean = false;
       boolean driverNameBoolean = false;

         // driverID veryfication
       do{
           System.out.print("Please enter driver ID: ");
           String driverID = input.nextLine();
             if(driverID.length() != 8)
             System.out.println("Invalid driver ID should be only 8 marks !!!!!!");
            else
                driverIdBoolean = true;
       }while (!driverIdBoolean);

       //driver Name veryfication
       do{
           System.out.print("Please enter driver Name: ");
           String driverName = input.nextLine();

       }while(!driverNameBoolean);


   }

    public String toString() {
        if (month == 8){ monthAsString = "August";}
        else if (month == 12) {monthAsString = "December";}
        else if (month == 11) {monthAsString = "November";}
        else if (month == 2) {monthAsString = "February";}
        else if (month == 4) {monthAsString = "April";}
    return "\nNAME:\t      " +driverName+ "\nDriverID:\t  " +driverID+ "\nLicence:\t  " +licenceType+
            "\nKilometres:   " +kilometers+"\nAddress:      " +driverAddres+ "\nStart Date:   " +day+ " " +monthAsString+
            " " +year+ "\nAvailability: " + driverAvailability +"\n*********************************";
    }

}

