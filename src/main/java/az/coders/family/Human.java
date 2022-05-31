package az.coders.family;

public class Human {

    public String name;
    public String surname;
    public short year;
    public byte iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, short year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, short year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, short year, byte iq, Pet pet, Human mother, Human father,
                 String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.printf("Hello, %s", pet.nickname);
    }

    public void describePet() {
        System.out.printf("I have a %s, he is %d years old, he is %s",
                pet.species, pet.age, pet.trickLevel > 50 ? "very sly" : "almost not sly");
    }
}
