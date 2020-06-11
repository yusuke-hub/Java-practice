package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person();
	    person.setFirstName("");
	    person.setLastName("");
	    person.setAge(10);
        System.out.println("fullName= " + person.getFirstName());
        System.out.println(person.getAge());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFirstName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("Smith");
        System.out.println("fullName= " + person.getFirstName());

    }
}
