package stream;

public class Employee {
    private String name;
    private String city;
    private Integer noOfSales;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Integer getNoOfSales() {
        return noOfSales;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNoOfSales(Integer noOfSales) {
        this.noOfSales = noOfSales;
    }

    public Employee(String name, String city, Integer noOfSales) {
        this.name = name;
        this.city = city;
        this.noOfSales = noOfSales;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name +
                ", city='" + city   +
                ", noOfSales=" + noOfSales + '}';
    }
}
