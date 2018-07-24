import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodReference {
	public static void main(String args[]) {
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		Collections.sort(people, Person :: compareAge);
		// same as
		Collections.sort(people, (p1, p2) -> Person.compareAge(p1, p2));
		
		people.forEach((str) -> System.out.println(str));
	}
}
