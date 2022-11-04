package interfaceEx;

public class OverridingHiding {
    public static void main(String[] args) {
        Car.printCompany(1);
        Truck.printCompany(2);
         
        Car car = new Car("소나타", "현대 자동차", 3000 , 3);
        Truck truck = new Truck("Volvo", "General Auto",5000, 10, 4);
         
        car.printInfo(5); 
        truck.printInfo(6);
        System.out.println();
        
        car.printCompany(7);  //Car.printCompany();
        truck.printCompany(8); //Truck.printCompany();
         
        Car c = (Car)truck;
        c.printInfo(9);
        System.out.println();
        c.printInfo1(10);
    }
}
 
