public class Person {
    private String name;
    private String getName() {
//TODO: return the person's name
        return name;
    }
    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + this.name + ".");
    }
    public Person(String name) {
        this.name = name;
    }//lines 19-21 are our constructor

    public static void main(String[] args) {
//        Person person1 = new Person("Nicole");
//        System.out.println(person1.getName()); //how to call setName and sayHello?

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2); // why did this output false?

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //output was true as i expected

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName()); // i expected output to be john john john jane but it is john john jane jane..why?


    }
}