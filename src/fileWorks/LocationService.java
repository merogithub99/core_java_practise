package fileWorks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LocationService {
     final List<Location> locationList = new ArrayList<>();

    public List<Location> readLocation() {
        String filePath = "C://Users/Rdhak/Downloads/location.csv";

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                Location location = new Location();
                location.setProvince(data[0]);
                location.setDistrict(data[1]);
                location.setMunicipality(data[2]);
                locationList.add(location);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Better to print the exception for debugging
        }

        return locationList;
    }

    public int getTotalProvinces() {
        Set<String> provinces = new HashSet<>();
        for (Location location : locationList) {
            provinces.add(location.getProvince());
        }
        return provinces.size();
    }

    public int getTotalDistricts() {
        Set<String> districts = new HashSet<>();
        for (Location location : locationList) {
            districts.add(location.getDistrict());
        }
        return districts.size();
    }

    public int getTotalMunicipalities() {
        List<String> municipalities = new ArrayList<>();
        for (Location location : locationList) {
            municipalities.add(location.getMunicipality());
        }
        return municipalities.size();
    }

    public void printUniqueProvinces() {
        Set<String> provinces = new HashSet<>();
        for (Location location : locationList) {
            provinces.add(location.getProvince());
        }
        System.out.println("Unique Provinces:");
        for (String province : provinces) {
            System.out.println(province);
        }
    }

    public void printUniqueDistricts() {
        Set<String> districts = new HashSet<>();
        for (Location location : locationList) {
            districts.add(location.getDistrict());
        }
        System.out.println("Unique Districts:");
        for (String district : districts) {
            System.out.println(district);
        }
    }

    public void printUniqueMunicipalities() {
        Set<String> municipalities = new HashSet<>();
        for (Location location : locationList) {
            municipalities.add(location.getMunicipality());
        }
        System.out.println("Unique Municipalities:");
        for (String municipality : municipalities) {
            System.out.println(municipality);
        }
    }

    public void findLocationByDistrict(String districtName) {
        boolean found = false;
        for (Location location : locationList) {
            if (location.getDistrict().equalsIgnoreCase(districtName)) {
                System.out.println("District: " + location.getDistrict());
                System.out.println("Province: " + location.getProvince());
                System.out.println("Municipality: " + location.getMunicipality());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("District not found.");
        }
    }




    public void findLocationByMunicipality(String municipalityName) {
        boolean found = false;
        for (Location location : locationList) {
            if (location.getMunicipality().equalsIgnoreCase(municipalityName)) {
                System.out.println("Municipality: " + location.getMunicipality());
                System.out.println("District: " + location.getDistrict());
                System.out.println("Province: " + location.getProvince());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Municipality not found.");
        }
    }
}