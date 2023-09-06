
public class Car {
    int year;
    String make;
    String model;
    String nummerplade;
    String kilometertal;
    float price;

    Car(){

    }

    public Car(int year, String make, String model, String nummerplade, String kilometertal, float price) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.nummerplade = nummerplade;
        this.kilometertal = kilometertal;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNummerplade() {
        return nummerplade;
    }

    public void setNummerplade(String nummerplade) {
        this.nummerplade = nummerplade;
    }

    public String getKilometertal() {
        return kilometertal;
    }

    public void setKilometertal(String kilometertal) {
        this.kilometertal = kilometertal;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", nummerplade='" + nummerplade + '\'' +
                ", kilometertal='" + kilometertal + '\'' +
                ", price=" + price +
                '}';
    }
}
