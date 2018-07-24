import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StreamsAggregateFunctions {
	
	public static void main(String args[]) {
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Max", 48));
		persons.add(new Person("Mike", 50));
		persons.add(new Person("Marsh", 60));
		
		long count = persons.stream().count();
		System.out.println(count);
		
		long sum = persons.stream().parallel()
				.mapToInt(p -> p.getAge())
				.sum();
		
		System.out.println(sum);
		
		OptionalDouble average = persons.parallelStream()
				.mapToInt(p -> p.getAge())
				.average();
		
		if(average.isPresent()) {
			System.out.println(average.getAsDouble());
		} else {
			System.out.println("Nothing dere");
		}
		
		persons.stream()
				.filter(p -> p.getAge() >= 50)
				.map(p -> p.getName())
				.forEach((name) -> System.out.println(name));
	}
}
