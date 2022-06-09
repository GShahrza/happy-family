package az.coders.family;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private short year;
    private byte iq;

    private String[][] schedule;

    static {
        System.out.println(Human.class.getName() + " class created");
    }

    {
        System.out.println(Human.class.getName() + " object created");
    }
    public Human() {
    }

    public Human(String name, String surname, short year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, short year, byte iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public byte getIq() {
        return iq;
    }

    public void setIq(byte iq) {
        this.iq = iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {

        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Human{name=%s, surname=%s, year=%d, iq=%d,schedule=%s}",
                name, surname, (int) year, (int) iq, Arrays.toString(schedule));
    }
}
