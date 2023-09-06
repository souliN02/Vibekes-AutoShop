import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> carInventory = new ArrayList<>();
        ArrayList<Person> customerList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Vibekes AutoShop");
            System.out.println("Select one of the following options");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Car");
            System.out.println("3. See Car Inventory");
            System.out.println("4. See Customer List");

            int userInput = scan.nextInt();
            scan.nextLine();

            switch (userInput) {
                case 1:
                    Person person = new Person();
                    System.out.println("Indtast Navn");
                    person.firstName = scan.nextLine();

                    System.out.println("Indtast efternavn");
                    person.lastName = scan.nextLine();

                    System.out.println("Indtast venligst køn");
                    person.gender = scan.nextLine();

                    System.out.println("Indtast alder");
                    person.age = Integer.parseInt(scan.nextLine());

                    customerList.add(person);
                    break;

                case 2:
                    Car car = new Car();
                    System.out.println("We shall now add a car to your inventory");
                    System.out.println("Please enter a car make");
                    car.make = scan.nextLine();

                    System.out.println("Please enter car model");
                    car.model = scan.nextLine();

                    System.out.println("Nummerplade");
                    car.nummerplade = scan.nextLine();

                    System.out.println("kilometertal");
                    car.kilometertal = scan.nextLine();

                    System.out.println("Year");
                    car.year = Integer.parseInt(scan.nextLine());

                    System.out.println("price");
                    car.price = Float.parseFloat(scan.nextLine());

                    carInventory.add(car);
                    break;

                case 3:
                    System.out.println(carInventory.toString());
                    break;

                case 4:
                    System.out.println(customerList.toString());
                    break;
            }
        }
    }
}