package classworc20160725;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.age = 20;
        person1.name = "Vova";

        Person person2 = new Person();

        person2.age = 74;
        person2.name = "Lesha";

        printPerson(person1);

        Person.foo = 3;

        Person.printFoo();

        person1.print();



    }

    public static void printPerson (Person p){
        System.out.println(p.age + " " + p.name);

    }
}
