import java.util.ArrayList;
import java.util.List;

public class Vehicles {
    private String vehicleType, registrationNumber, brand, model, isWheelchair, vehicleAvailability, licenceType;
    private float kmsDriven, vehicleTotalAmount, vehicleTotalKilometres;
    private int capacity;

public Vehicles(){VehiclesInicialisation();}
    public Vehicles(String vehicleType, String registrationNumber, String brand, String model, float kmsDriven, int capacity,
                    String  isWheelchair, String vehicleAvailability, String licenceType, float vehicleTotalAmount,
                    float vehicleTotalKilometresDriven){
            this.vehicleType = vehicleType;
            this.registrationNumber = registrationNumber;
            this.brand = brand;
            this.model = model;
            this.kmsDriven = kmsDriven;
            this.capacity = capacity;
            this.isWheelchair = isWheelchair;
            this. vehicleAvailability = vehicleAvailability;
            this.licenceType = licenceType;
            this.vehicleTotalAmount = vehicleTotalAmount;
            this.vehicleTotalKilometres = vehicleTotalKilometresDriven;

    }



    void setIsWheelchair( String isWheelchair){ this.isWheelchair = isWheelchair;}
    void setVehicleAvailability( String vehicleAvailability){ this.vehicleAvailability = vehicleAvailability;}
    void setVehicleTotalAmount( float vehicleTotalAmount){ this.vehicleTotalAmount = vehicleTotalAmount;}
    void setVehicleTotalKilometres ( float vehicleTotalKilometres){ this.vehicleTotalKilometres = vehicleTotalKilometres;}

    String getVehicleType(){return vehicleType;}
    String getRegistrationNumber(){ return registrationNumber;}
    String getBrand(){ return brand;}
    String getModel(){ return model;}
    String getIsWheelchair(){return isWheelchair;}
    String getVehicleAvailability(){return vehicleAvailability;}
    float getKmsDriven(){ return kmsDriven;}
    float getCapacity(){ return capacity;}
    float getVehicleTotalAmount(){ return vehicleTotalAmount;}
    float getVehicleTotalKilometres(){ return  vehicleTotalKilometres;}

    Vehicles taxi, taxi2, taxi3, taxi4, taxi5, taxi6, bus, bus1, miniBus, miniBus2, miniBus3;

    ArrayList<Vehicles> vehiclesInArray= new ArrayList();

     void VehiclesInicialisation(){
        taxi = new Vehicles("Taxi","12C4956","Hyundai"," i30 Tourer",
                65172,4,"No","Free","B",
                0, 0);
        taxi2 = new Vehicles("Taxi","14C89365","Ford","Mondeo",
                33892,4,"No","Free","B",
                0, 0);
        taxi3 = new Vehicles("Taxi","15C46046","VW","Passat",
                23897,4,"Yes","Free","B",
                0, 0);
        taxi4 = new Vehicles("Taxi","14C38492","Nissan","Primera",
                29418,4,"Yes","Free","B",
                0, 0);
        taxi5 = new Vehicles("Taxi","10C99393","Skoda","Octavia",
                89678,4,"Yes","Free","B",
                0, 0);
        taxi6 = new Vehicles("Taxi","15C23796","Seat","Toledo",
                12812,4,"Yes","Free","B",
                0, 0);
        miniBus = new Vehicles("Minibus","14C23908","Ford","Transit",
                18827,16,"Yes","Free","D",
                0, 0);
        miniBus2 = new Vehicles("Minibus","10C831","Fiat","Ducato",
                32986,16,"Yes","Free","D",
                0, 0);
        miniBus3 = new Vehicles("Minibus","13C82677","Mercedes","Vario",
                18567,20,"No","Free","D",
                0, 0);
         bus = new Vehicles ("Bus","10C37209","Ace","Cougar",
                 28786,48,"Yes","Free","D1",
                 0, 0);
         bus1 = new Vehicles ("Bus","11C882","Daimler","Fleetline",
                 68893,48,"No","Free","D1",
                 0, 0);
         vehiclesInArray.add(taxi);
         vehiclesInArray.add(taxi2);
         vehiclesInArray.add(taxi3);
         vehiclesInArray.add(taxi4);
         vehiclesInArray.add(taxi5);
         vehiclesInArray.add(taxi6);
         vehiclesInArray.add(bus);
         vehiclesInArray.add(bus1);
         vehiclesInArray.add(miniBus);
         vehiclesInArray.add(miniBus2);
         vehiclesInArray.add(miniBus3);
    }

    void printVehicle(){
         for(int i = 0; i < vehiclesInArray.size(); i++){
             System.out.println(vehiclesInArray.get(i));
         }
    }

@Override
    public String toString() {
        return "\nVehicle Type\t " +vehicleType+ "\nRegistration No: " +registrationNumber+ "\nBrand:\t\t\t " +brand+
                "\nModel:\t\t\t " +model+"\nKilometres:      " +kmsDriven+ "\nCapacity:\t\t " +capacity + "\nWheelchair:\t\t " +
                isWheelchair+ "\nAvailability:\t " + vehicleAvailability + "\nLicence Type:   \""+ licenceType+ "\"\n\tTotal Income:\t  "+
                vehicleTotalAmount+ "\n\tKilometers Total: "+ vehicleTotalKilometres+ "\n*********************************************************";
        }

    }

