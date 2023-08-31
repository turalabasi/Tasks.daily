public class RealInternet implements Internet {
    @Override
    public void ConnectTo(String serverHost) {
        System.out.println("Connecting to " + serverHost);
    }
}
