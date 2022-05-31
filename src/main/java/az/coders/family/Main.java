package az.coders.family;


public class Main {
    public static void main(String[] args) {
        Pet tom = new Pet("CAT", "Tom");

        Pet lessi = new Pet("DOG", "Lessi", (byte) 1, (byte) 20, new String[]{"jump", "lick"});

        Human father = new Human("Father","Father",(short)1970);
        Human mother  = new Human("Mother","Mother",(short)1978);

        Human boy = new Human("Boy","Boy",(short)2001);
        boy.pet = lessi;
        boy.mother = mother;
        boy.father = father;

        System.out.println(boy);
        System.out.println(boy.pet.nickname);
        System.out.println(boy.father.year);
    }
}
