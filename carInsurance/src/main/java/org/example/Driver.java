package org.example;
import java.util.Scanner;


public class Driver {

    public static void main(String[] args) {
//

        System.out.println("Vehicle type");

        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        int premium = 0;
        switch (type) {
            case "Car":
                premium = 200;
                break;
            case "Truck":
                premium = 300;
                break;
            case "SUV":
                premium = 400;
                break;
            case "Van":
                premium = 400;
                break;
            case "Boat":
                premium = 150;
                break;
            case "Motorcycle":
                premium = 100;
                break;
            case "Commercial":
                System.out.println("Enter Vehicle type");
                System.out.println("1 (Car), 2(Truck), 3(Van), 4 (SUV), 5 (Box Truck), 6 (Trailer)");
                String commercialType = scan.nextLine();
                int commercialInt = Integer.parseInt(commercialType);
            switch (commercialInt){
                case 1:
                    premium = 250;
                    break;
                case 2:
                    premium = 350;
                    break;
                case 3:
                    premium = 450;
                    break;
                case 4:
                    premium = 451;
                    break;
                case 5:
                    premium = 151;
                    break;
                case 6:
                    premium = 1000;
                    break;
                default:
                    System.out.println("Error Unknown Commercial Vehicle Type");
            }
            break;
            default:
                System.out.println("Error Unknown Vehicle");
        }
            scan.close();
                System.out.println("The premium is $" + premium);


    }


}
