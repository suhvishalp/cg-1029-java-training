import java.util.ArrayList;
import java.util.List;

public class PersonList {
	
    public static List<Person> createPersonList() {
        List<Person> listPersons = new ArrayList<>();
        
        listPersons.add(new Person("Alice", "Brown", "alice.brown@gmail.com", Gender.FEMALE, 26));
        listPersons.add(new Person("Bob", "Young", "bob.young@yahoo.com", Gender.MALE, 32));
        listPersons.add(new Person("Carol", "Hill", "carol.hill@gmail.com", Gender.FEMALE, 23));
        listPersons.add(new Person("David", "Green", "david.green@hotmail.com", Gender.MALE, 39));
        listPersons.add(new Person("Eric", "Young", "eric.young@gmail.com", Gender.MALE, 26));
        listPersons.add(new Person("Frank", "Thompson", "frank.t@outlook.com", Gender.MALE, 33));
        listPersons.add(new Person("Gibb", "Brown", "gibb.brown@gmail.com", Gender.MALE, 27));
        listPersons.add(new Person("Henry", "Baker", "henry.baker@gmail.com", Gender.MALE, 30));
        listPersons.add(new Person("Isabell", "Hill", "isabell.hill@gmail.com", Gender.FEMALE, 22));
        listPersons.add(new Person("Jane", "Smith", "jane.smith@gmail.com", Gender.FEMALE, 24));
        listPersons.add(new Person("Lisa", "Johnson", "lisa.j@hotmail.com", Gender.FEMALE, 45));
        listPersons.add(new Person("Mark", "Evans", "mark.e@company.com", Gender.MALE, 55));
        listPersons.add(new Person("Nina", "Gonzalez", "nina.gonzalez@gmail.com", Gender.FEMALE, 31));
        listPersons.add(new Person("Oscar", "Black", "oscar.black@gmail.com", Gender.MALE, 60));
        listPersons.add(new Person("Paul", "White", "paul.white@company.com", Gender.MALE, 48));
        
        return listPersons;
    }
}
