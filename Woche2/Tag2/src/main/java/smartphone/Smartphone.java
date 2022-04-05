package smartphone;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{
    String model = "H9";
    String manufacturer = "Huawei";
    Contact[] listOfAllContacts;

    public Smartphone(){}
    public Smartphone(String model, String manufacturer, Contact[] listOfAllContacts){
        this.model = model;
        this.manufacturer = manufacturer;
        this.listOfAllContacts = listOfAllContacts;
    }

    @Override
    public String toString() {
        return "Smartphone:\n" +
                "smartphone model='" + model + '\'' +
                ",smartphone manufacturer='" + manufacturer + '\'' +
                ", listOfAllContacts=" + Arrays.toString(listOfAllContacts);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Contact[] getListOfAllContacts() {
        return listOfAllContacts;
    }

    public void setListOfAllContacts(Contact[] listOfAllContacts) {
        this.listOfAllContacts = listOfAllContacts;
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped.");
        return false;
    }

    @Override
    public String getPosition() {
        return "Hamburg";
    }
}
