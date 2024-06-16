package org.example.oop_dz4.model;

public abstract class User {
    private String firstName;
    private String lastName;
    private String middleName;

    public User(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Класс User теперь абстрактны и может содержать абстрактные методы,
     * которые будут общими для всех наследников класса User.
     * метод getId реализован в наследниках класса
     * @return
     */
    public abstract long getID();
}

