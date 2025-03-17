package web.common;

import java.util.Date;

public class Dog extends Animal {

    private String cryingSound;

    public Dog() {
        super();
    }

    public Dog(String name, String cryingSound) {
        super(name);
        this.cryingSound = cryingSound;
    }

    public String getCryingSound() {
        return cryingSound;
    }

    public void setCryingSound(String cryingSound) {
        this.cryingSound = cryingSound;
    }

    @Override
    public String toString() {
        return super.toString() + " " + cryingSound;
    }
}
