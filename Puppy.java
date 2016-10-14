package Pets;

/**
 * Created by ZHARKOOE on 13.10.2016.
 */
public class Puppy extends  Dog {
    @Override
    public void bark(String name) {
        super.bark(name);
    }

    @Override
    public void run(String name) {
        super.run(name);
    }

    @Override
    public void jump(String name) {
        super.jump(name);
    }

    @Override
    public void bite(String name) {
        super.bite(name);
    }

    public Puppy(String breed, String gender, String name) {
        super(breed, gender, name);

    }

    @Override
    public String toString() {
        return super.toString() + "Puppy{}";
    }
}
