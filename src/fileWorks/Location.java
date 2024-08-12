package fileWorks;

public class Location {

    String province;
    String district;
    String municipality;

    public Location() {
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public Location(String province, String district, String municipality) {
        this.province = province;
        this.district = district;
        this.municipality = municipality;
    }

    @Override
    public String toString() {
        return "Location{" +
                "province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", municipality='" + municipality + '\'' +
                '}';
    }
}
