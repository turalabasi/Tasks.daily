public class InternetProxy implements  Internet{

    private Internet RealInternet;

    public InternetProxy() {
        this.RealInternet = new RealInternet();}

    @Override
    public void ConnectTo(String serverHost) {
         if(isServerAllowed(serverHost)) {
             RealInternet.ConnectTo(serverHost);
         } else{
             System.out.println("Access denied. Server not allowed.");

        }}

    private boolean isServerAllowed(String serverHost) {

        return serverHost.endsWith(".com");
    }
}

