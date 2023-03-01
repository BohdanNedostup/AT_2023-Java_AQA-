package itstep.task_5;

import java.io.Serializable;

public class User implements Serializable, Comparable {

    private boolean isEmployed;
    private String name;
    private Address address;

    public User() {
    }

    public User(boolean isEmployed, String name, Address address) {
        this.isEmployed = isEmployed;
        this.name = name;
        this.address = address;
    }

    public boolean getIsEmployed() {
        return isEmployed;
    }

    public void setIsEmployed(boolean employed) {
        isEmployed = employed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "isEmployed=" + isEmployed +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        User o1 = (User) this;
        User o2 = (User) o;

        if (o1.getName().compareTo(o2.getName()) == 0)
            return o1.getAddress().getStreet().compareTo(o2.getAddress().getStreet());

        return o1.getName().compareTo(o2.getName());
    }
}
