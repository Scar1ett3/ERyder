public class Main {
    public static void main(String[] args) throws Exception {
        ERyder bike1 = new ERyder("1744ef",70,true,765.2f,"ngc232123",193848323);
        bike1.printBikeDetails();
        bike1.printRideDetails(52);
        ERyder bike2 = new ERyder("1234xx",98,true,23.5f);
        bike2.printBikeDetails();
        bike2.printRideDetails(30);
        bike2.ride();
        System.out.println("Can't use the private method directly. Must use another public method.");
        System.out.println(bike2.getTotalFare(30));
    }
}
