public class Dog extends Animal {

    // Dog är ett Animal ärver från Animal

    private boolean hasTail;
    private Home home;

    public Dog(String type, String size, double weight, boolean hasTail) {
        //Konstruktorn från Animal som vi ärver.
        super(type, size, weight);
        // Vi kan lägga till egna instansvariabler för en hund.
        this.hasTail = hasTail;
        // Men en hund kan även HA ett hem. // composition.
        home = new Home("Adress1", 12345);
    }

    @Override
    public void makeNoise() {
        System.out.println(type + "Makes some kind of noise");
    }



    public boolean getVaccinated (boolean hasBeenVaccinated) {

        return hasBeenVaccinated;

        
    }

        public void getVaccinated() {

    }

    public void getVaccinated (String date) {

    }

    public String getHomeAdress() {
        return home.getAddress();
    }
    
    
}
