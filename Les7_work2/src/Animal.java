import java.io.Serializable;

public class Animal implements Serializable {
    private int old;
    private String name;
    private String sound;

    public Animal() {
    }

    public Animal(int old, String name, String sound) {
        this.old = old;
        this.name = name;
        this.sound = sound;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
