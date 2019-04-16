import java.util.Scanner;




/**

 * SeedScript. Generates sample MySQL tuples based on user input amount.

 * 

 * @author Kristina Capistrano, Alex Zhou 

 * @version 04.15.2019

 */

public class SeedScript {

    final static String INSERT = "INSERT ", INTO = "INTO ", VALUES = " VALUES ", SEPARATOR = ", ", APOSTROPHE = "'";

    

    /**
     * The tables are organized by Heirarchy, 
     *  where the tables prior will provide FK respectively.
     * @param args
     */
    public static void main(String[] args) {
        //tables
        String[] ground_company, air_company, water_company;

        String[] ground_transportation, air_tranportation, water_transportation;

        String[] transportation_purpose;
        
        String[] licensed_driver, licensed_captain, licensed_pilot ;
        
        String[] customer;
        
        String[] air_hangar, parking_garage, storage_dock;

        String[] ground_service;
        
        String[] owns, rent;
        
        String[] service_company;


        
        int num = 0;

        boolean valid = false;

        Scanner num_reader = new Scanner(System.in);

        do {

            System.out.print("Enter how many tuples you'd like to generate: ");

            if(num_reader.hasNextInt()) {

                num = num_reader.nextInt();

                valid = true;

            } else {

                num_reader.next();

            }

        } while(!valid);

        System.out.println();

        

        ground_company = genTableCompany(num, "ground_company");

        air_company = genTableCompany(num, "air_company");

        water_company = genTableCompany(num, "water_company");

        ground_transportation = genTableTrans(num, "ground_transportation");

        air_tranportation = genTableTrans(num, "air_tranportation");

        water_transportation = genTableTrans(num, "water_transportation");

        licensed_driver = genTableLic(num, "licensed_driver");
        licensed_captain = genTableLic(num, "licensed_captain");
        licensed_pilot = genTableLic(num, "licensed_pilot");
        
        customer = customerTable(num, "customer");

        transportation_purpose = purposeTable(num, "transportation_purpose");

        air_hangar = genStorageTable(num, "air_hangar");
        parking_garage = genStorageTable(num, "parking_garage");
        storage_dock = genStorageTable(num, "storage_dock");

        ground_service = genGS(num, "ground_service");
        owns = genOwns(num, "owns");
        rent = genRent(num, "rent");
        service_company = genSC(num, "service_company");

        printAll(ground_company);

        printAll(air_company);

        printAll(water_company);

        printAll(ground_transportation);

        printAll(air_tranportation);

        printAll(water_transportation);
        
        printAll(licensed_driver);
        
        printAll(licensed_captain);
        
        printAll(licensed_pilot);

        printAll(customer);
        
        printAll(transportation_purpose);
        
        printAll(air_hangar);
        printAll(parking_garage);
        printAll(storage_dock);
        
        printAll(ground_service);
        printAll(owns);

        printAll(rent);
        printAll(service_company);






    }

    static void printAll(String[] in) {

        for(String e : in)

            System.out.println(e);

        System.out.println("+++++++++++++");

    }

    

    static String[] genTableCompany(int num, String tableName) {

        String[] out = new String[num];

        

        if(num < 1) {

            System.out.println("Less than 1 tuples requested. Table will be empty ");

            return out;

        }

        

        boolean isValid = false;

        String[] validTableNames = new String[] {"ground_company", "air_company", "water_company"};

        for(String name : validTableNames)

            if(tableName.equals(name))

                isValid = true;

        

        if(!isValid) {

            System.out.println("Not a tableName! Need all lowercase.");

            return out;

        }

        String name = "", address = "Address", Building_no = "0000000000";

        name += tableName.substring(0,1).toUpperCase() + tableName.substring(1);

        for(int i = 0 ; i < num ; i++) {

            Building_no = Building_no.substring(0, 10 - ((int) (Math.log10(i == 0 ? 1 : i) + 1))) + i;

            

            out[i] = INSERT + INTO + tableName + VALUES + "("

                    + APOSTROPHE + address + i + APOSTROPHE + SEPARATOR + APOSTROPHE + name + i + APOSTROPHE + SEPARATOR + APOSTROPHE + Building_no  + APOSTROPHE + ");";

        }

        

        return out;

    }

    static String[] genTableTrans(int num, String tableName) {

        String[] out = new String[num];

        

        if(num < 1) {

            System.out.println("Less than 1 tuples requested. Nothing produced.");

            return out;

        }

        

        boolean isValid = false;

        String[] validTableNames = new String[] {"ground_transportation", "air_transportation", "water_transportation"};

        for(String name : validTableNames)

            if(tableName.equals(name))

                isValid = true;

        

        if(!isValid) {

            System.out.println("Not a tableName! Need all lowercase.");

            return out;

        }

        String make = "", model = "x";
        int capacity = 0;


        make += tableName.substring(0,1).toUpperCase() + tableName.substring(1);

        for(int i = 0 ; i < num ; i++) {


            capacity++;
            

            out[i] = INSERT + INTO + tableName + VALUES + "("

                    + APOSTROPHE + make + i + APOSTROPHE + SEPARATOR + APOSTROPHE + model + i + APOSTROPHE + SEPARATOR + APOSTROPHE + capacity  + APOSTROPHE + ");";

        }

        

        return out;

    }

    static String[] genTableLic(int num, String tableName) {

        String[] out = new String[num];

        

        if(num < 1) {

            System.out.println("Less than 1 tuples requested. Nothing produced.");

            return out;

        }

        boolean isValid = false;

        String[] validTableNames = new String[] {"licensed_driver", "licensed_pilot", "licensed_captain"};

        for(String name : validTableNames)

            if(tableName.equals(name))

                isValid = true;

        

        if(!isValid) {

            System.out.println("Not a tableName! Need all lowercase.");

            return out;

        }
        
        String id = "D", ssn = "00000000000";
        int dob = 1980;
        String fname = "name", lname = "lastName";
        char sex = 'm';
        


        id += tableName.substring(0,1).toUpperCase() + tableName.substring(1);

        for(int i = 0 ; i < num ; i++) {

            ssn = ssn.substring(0, 11 - ((int) (Math.log10(i == 0 ? 1 : i) + 1))) + i;
            dob ++;
            
            
            

            out[i] = INSERT + INTO + tableName + VALUES + "("

                    + APOSTROPHE + id + i + APOSTROPHE + SEPARATOR + APOSTROPHE + ssn + i + APOSTROPHE + SEPARATOR + APOSTROPHE + dob  + APOSTROPHE + 
                    SEPARATOR + APOSTROPHE + fname  + APOSTROPHE + SEPARATOR + APOSTROPHE + lname  + APOSTROPHE 
                    + SEPARATOR + APOSTROPHE + sex  + APOSTROPHE+ ");";

        }

        

        return out;

    }

    static String[] customerTable(int num, String tableName) {

        String[] out = new String[num];

        

        if(num < 1) {

            System.out.println("Less than 1 tuples requested. Nothing produced.");

            return out;

        }

        boolean isValid = false;

        String[] validTableNames = new String[] {"customer"};

        for(String name : validTableNames)

            if(tableName.equals(name))

                isValid = true;

        

        if(!isValid) {

            System.out.println("Not a tableName! Need all lowercase.");

            return out;

        }
        
        String customer_id = "", ssn = "00000000000";
        int dob = 1980;
        String fname = "name", lname = "lastName";
        char sex = 'm';
        


        customer_id += tableName.substring(0,1).toUpperCase() + tableName.substring(1);

        for(int i = 0 ; i < num ; i++) {

            ssn = ssn.substring(0, 11 - ((int) (Math.log10(i == 0 ? 1 : i) + 1))) + i;
            dob ++;
            
            
            

            out[i] = INSERT + INTO + tableName + VALUES + "("

                    + APOSTROPHE + customer_id + i + APOSTROPHE + SEPARATOR + APOSTROPHE + ssn + i + APOSTROPHE + SEPARATOR + APOSTROPHE + dob  + APOSTROPHE + 
                    SEPARATOR + APOSTROPHE + fname  + APOSTROPHE + SEPARATOR + APOSTROPHE + lname  + APOSTROPHE 
                    + SEPARATOR + APOSTROPHE + sex  + APOSTROPHE+ ");";

        }

        

        return out;

    }
    
    static String[] purposeTable(int num, String tableName) {

        String[] out = new String[num];

        

        if(num < 1) {

            System.out.println("Less than 1 tuples requested. Nothing produced.");

            return out;

        }

        

        boolean isValid = false;

        String[] validTableNames = new String[] {"ground_transportation", "air_transportation", "water_transportation"};

        for(String name : validTableNames)

            if(tableName.equals(name))

                isValid = true;

        

        if(!isValid) {

            System.out.println("Not a tableName! Need all lowercase.");

            return out;

        }

        String purpose = "", make = "D" , model = "x";
        


        purpose += tableName.substring(0,1).toUpperCase() + tableName.substring(1);

        for(int i = 0 ; i < num ; i++) {

            

            out[i] = INSERT + INTO + tableName + VALUES + "("

                    + APOSTROPHE + purpose + i + APOSTROPHE + SEPARATOR + APOSTROPHE + model + i + APOSTROPHE + ");";

        }

        

        return out;

    }
    
    static String[] genStorageTable(int num, String tableName) {

        String[] out = new String[num];

        

        if(num < 1) {

            System.out.println("Less than 1 tuples requested. Nothing produced.");

            return out;

        }

        

        boolean isValid = false;

        String[] validTableNames = new String[] {"air_hangar", "parking_garage", "storage_dock"};

        for(String name : validTableNames)

            if(tableName.equals(name))

                isValid = true;

        

        if(!isValid) {

            System.out.println("Not a tableName! Need all lowercase.");

            return out;

        }

        String name = "", address = "Address";
        int capacity = 0;

        name += tableName.substring(0,1).toUpperCase() + tableName.substring(1);

        for(int i = 0 ; i < num ; i++) {


            capacity++;

            out[i] = INSERT + INTO + tableName + VALUES + "("

                    + APOSTROPHE + address + i + APOSTROPHE + SEPARATOR + APOSTROPHE + name + i + APOSTROPHE + SEPARATOR + APOSTROPHE + capacity  + APOSTROPHE + ");";

        }

        

        return out;

    }
    
    static String[] genGS(int num, String tableName) {

        String[] out = new String[num];

        

        if(num < 1) {

            System.out.println("Less than 1 tuples requested. Nothing produced.");

            return out;

        }

        boolean isValid = false;

        String[] validTableNames = new String[] {"customer"};

        for(String name : validTableNames)

            if(tableName.equals(name))

                isValid = true;

        

        if(!isValid) {

            System.out.println("Not a tableName! Need all lowercase.");

            return out;

        }
        
        String make = "", model = "", type = "", time = "" , location = "" ;
        
        
        

        make += tableName.substring(0,1).toUpperCase() + tableName.substring(1);

        for(int i = 0 ; i < num ; i++) {
      

            out[i] = INSERT + INTO + tableName + VALUES + "("

                    + APOSTROPHE + make + i + APOSTROPHE + SEPARATOR + APOSTROPHE + model + i + APOSTROPHE + SEPARATOR + APOSTROPHE + type  + APOSTROPHE + 
                    SEPARATOR + APOSTROPHE + time  + APOSTROPHE + SEPARATOR + APOSTROPHE + location  + APOSTROPHE + ");";

        }

        

        return out;

    }
    
    static String[] genOwns(int num, String tableName) {

        String[] out = new String[num];

        

        if(num < 1) {

            System.out.println("Less than 1 tuples requested. Nothing produced.");

            return out;

        }

        boolean isValid = false;

        String[] validTableNames = new String[] {"customer"};

        for(String name : validTableNames)

            if(tableName.equals(name))

                isValid = true;

        

        if(!isValid) {

            System.out.println("Not a tableName! Need all lowercase.");

            return out;

        }
        
        String make = "", model = "", address = "";
        
        
        

        make += tableName.substring(0,1).toUpperCase() + tableName.substring(1);

        for(int i = 0 ; i < num ; i++) {
      

            out[i] = INSERT + INTO + tableName + VALUES + "("

                    + APOSTROPHE + make + i + APOSTROPHE + SEPARATOR + APOSTROPHE + model + i + APOSTROPHE + SEPARATOR + APOSTROPHE + address  + APOSTROPHE +  ");";

        }

        

        return out;

    }

    static String[] genRent(int num, String tableName) {

        String[] out = new String[num];

        

        if(num < 1) {

            System.out.println("Less than 1 tuples requested. Nothing produced.");

            return out;

        }

        boolean isValid = false;

        String[] validTableNames = new String[] {"customer"};

        for(String name : validTableNames)

            if(tableName.equals(name))

                isValid = true;

        

        if(!isValid) {

            System.out.println("Not a tableName! Need all lowercase.");

            return out;

        }
        
        String make = "", model = "", customerId = "0000000000";
        
        
        

        make += tableName.substring(0,1).toUpperCase() + tableName.substring(1);

        for(int i = 0 ; i < num ; i++) {
      
            customerId = customerId.substring(0, 11 - ((int) (Math.log10(i == 0 ? 1 : i) + 1))) + i;

            out[i] = INSERT + INTO + tableName + VALUES + "("

                    + APOSTROPHE + make + i + APOSTROPHE + SEPARATOR + APOSTROPHE + model + i + APOSTROPHE + SEPARATOR + APOSTROPHE + customerId  + APOSTROPHE +  ");";

        }

        

        return out;

    
    }
    
    static String[] genSC(int num, String tableName) {

        String[] out = new String[num];

        

        if(num < 1) {

            System.out.println("Less than 1 tuples requested. Nothing produced.");

            return out;

        }

        boolean isValid = false;

        String[] validTableNames = new String[] {"customer"};

        for(String name : validTableNames)

            if(tableName.equals(name))

                isValid = true;

        

        if(!isValid) {

            System.out.println("Not a tableName! Need all lowercase.");

            return out;

        }
        
        String make = "", model = "", type = "";
        String address = "", name = "";
        int contract = 0;
        
        
        
        
        

        make += tableName.substring(0,1).toUpperCase() + tableName.substring(1);

        for(int i = 0 ; i < num ; i++) {
      
            contract ++;
           
            out[i] = INSERT + INTO + tableName + VALUES + "("

                    + APOSTROPHE + make + i + APOSTROPHE + SEPARATOR + APOSTROPHE + model + i + APOSTROPHE + SEPARATOR + APOSTROPHE + type  + APOSTROPHE + 
                      SEPARATOR + APOSTROPHE + contract  + APOSTROPHE + SEPARATOR + APOSTROPHE + address  + APOSTROPHE + SEPARATOR + APOSTROPHE + name  + APOSTROPHE +");";
        }

        

        return out;

    }
}

