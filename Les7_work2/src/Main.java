import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("animal.txt");
        Animal animal = new Animal(5, "tiger", "rrrr");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            oos.writeObject(animal);

            Animal animal1 = (Animal) ois.readObject();
            System.out.println(animal1.getOld() + " " + animal1.getName() + " " + animal1.getSound());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}