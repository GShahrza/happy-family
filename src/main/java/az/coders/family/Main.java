package az.coders.family;


public class Main {
    public static void main(String[] args) {


        Pet less = new Pet("DOG", "Lessi", (byte) 1, (byte) 20, new String[]{"jump", "lick"});

        Human father = new Human("Father","Father",(short)1970);
        Human mother  = new Human("Mother","Mother",(short)1978);

        Family familyOne = new Family(father,mother);

        Human boy = new Human("Boy","Boy",(short)2001);
        Human girl = new Human("Girl","girl",(short)2003);

        System.out.println(familyOne);
        System.out.println("******************************");

        familyOne.addChild(boy);
        System.out.println(familyOne);
        System.out.println("******************************");

        familyOne.addChild(girl);
        System.out.println(familyOne);
        System.out.println(familyOne.countFamily());
        System.out.println("******************************");

        familyOne.deleteChild(girl);
        System.out.println(familyOne);
        System.out.println(familyOne.countFamily());
        System.out.println("******************************");

        familyOne.setPet(less);
        System.out.println(familyOne);


    }
}
