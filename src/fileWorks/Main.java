package fileWorks;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocationService locationService = new LocationService();
        List<Location> locationList = locationService.readLocation();

        Scanner scanner = new Scanner(System.in);

        boolean status = true;

        while (status) {
            System.out.println();
            System.out.println("Please choose one from the following...............");
            System.out.println("1: Province Information");
            System.out.println("2: District Information");
            System.out.println("3: Municipality Information");
            System.out.println("4: Find Location by District");
            System.out.println("5:Find municipality details");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Total Provinces: " + locationService.getTotalProvinces());
                    locationService.printUniqueProvinces();
                    break;
                case 2:
                    System.out.println("Total Districts: " + locationService.getTotalDistricts());
                    locationService.printUniqueDistricts();
                    break;
                case 3:
                    System.out.println("Total Municipalities: " + locationService.getTotalMunicipalities());
                    locationService.printUniqueMunicipalities();
                    break;
                case 4:
                    System.out.print("Enter the district name to find its location: ");
                    String districtName = scanner.nextLine();
                    locationService.findLocationByDistrict(districtName);
                    break;

                    case 5:
                        System.out.println("Enter the name of municipality");
                        String municipalityName=scanner.nextLine();
                        locationService.findLocationByMunicipality(municipalityName);
                        break;
                case 0:
                    status = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please input a valid number (0-4).");
            }
        }

        scanner.close();
    }
}
