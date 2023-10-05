public class Animal {
    
    // Huvudklassen, basklassen

    protected String type;
    protected String size;
    protected double weight;

    public Animal(String type, String size, double weight) {
        this.type= type;
        this.size = size;
        this.weight = weight;
    }

    public void move (String speed) {
        System.out.println(type + " moves" + speed);
    }

    public void makeNoise() {
        System.out.println("Animal makes some kind of noise");
    }


}
