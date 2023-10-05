public class Home {

    private String address;
    private int zipCode;

    public Home(String address, int zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }
    
    public String getAddress() {
        return this.address;
    }
}
