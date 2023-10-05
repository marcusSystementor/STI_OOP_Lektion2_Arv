import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Dog dog = new Dog("Dog", "Medium", 19.5, true);

        dog.makeNoise();

        System.out.println(dog.toString());

        ArrayList<Animal> listOfAnimals = new ArrayList<>();

        Shark shark = new Shark("Shark", "Large", 100.5);

        listOfAnimals.add(dog);
        listOfAnimals.add(shark);


        System.out.println(shark.toString());

        System.out.println(dog.getHomeAdress());

        

    }
}
