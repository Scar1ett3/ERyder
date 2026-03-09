public class Main {
    public static void main(String[] args) throws Exception {
        ERyder bike1 = new ERyder();
        bike1.kmDriven = 1;
        bike1.setBatteryLevel(20);
        bike1.printBikeDetails();
        ERyder bike2 = new ERyder("1234xx",98,true,23.5f);
        bike2.printBikeDetails();
        bike2.ride();
        bike1.kmDriven = 1;
    }
}
