import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethodReference {

	public static void main(String[] args) {
		
		InstanceMethodReference mainClass = new InstanceMethodReference();
		mainClass.sortData();
	}
	
	public void sortData() {
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		Collections.sort(people, this :: compareAges);
		// same as
		Collections.sort(people, (p1,p2) -> this.compareAges(p1, p2));
		
		people.forEach(people1 -> System.out.println(people1));
	}
	
	public int compareAges(Person p1, Person p2) {
		Integer age = p1.getAge();
		return age.compareTo(p2.getAge());
	}
}
