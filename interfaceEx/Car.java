package interfaceEx;

class Car {
    String carName;
    String company;
    int price;
    int num;
     
    Car(String carName, String company, int price, int num) {
        this.carName = carName;
        this.company = company;
        this.price = price;
        this.num = num;
        System.out.println(num +"번 Car()생성자 호출");
    }
     
    static void printCompany(int num) {
        System.out.println(num +"번(Car의 printCompany()메소드): 현대 자동차");
    }
     
    public void printInfo(int num) {
        System.out.printf("\n"+ num +"번(Car의 printInfo()메소드):  "
        + "차종:%s \t제조사:%s \t가격:%d \t", carName,company,price);
    }
    
    public void printInfo1(int num) {
        System.out.printf("\n"+ num +"번(Car의 printInfo()메소드):  "
        + "차종:%s \t제조사:%s \t가격:%d \t", carName,company,price);
    }
}
 
class Truck extends Car {
   int carName;
    int maxLoad;
     
    Truck(String carName, String company, int price, int maxLoad, int num) {
        super(carName, company, price, num);
        this.maxLoad = maxLoad;
        System.out.println(num +"번 Truck()생성자 호출");
    }
    // 부모 클래스의 printCompany() 메소드를 가린다(Hiding)
    public static void printCompany(int num) {
        System.out.println(num + "번(Truck의 printCompany()메소드): "
        + "General Auto Truck Division");
 
    }
     
    // 부모의 메소드를 오버라이딩
    public void printInfo(int num) {
        super.printInfo(num);
        System.out.printf("(Truck의 printCompany()메소드) 적재중량:%d", maxLoad);
    }
    
    public void printInfo1(int num) {
       System.out.printf(num+ "번 : (Truck의 printCompany()메소드) 적재중량:%d", maxLoad);
    }
}