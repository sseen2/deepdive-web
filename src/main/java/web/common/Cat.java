package web.common;

import java.util.Date;

public class Cat extends Animal {

    private Date dateOfBirth;

    public Cat() {
        super();
    }

    public Cat(String name, Date dateOfBirth) {
        super(name);
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return super.toString() + " " + dateOfBirth;
    }
}
