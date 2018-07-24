import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {
	public enum Sex {
		MALE, FEMALE
	}

	private String name;
	private Sex gender;
	private String emailAddress;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printPerson() {
		System.out.println(name + " with emailId " + emailAddress);
	}
	
	public static void processEmployee(Employee employee, Predicate<Employee> predicate, 
			Function<Employee, String> function, Consumer<String> consumer) {
		if (predicate.test(employee)) {
			String str = function.apply(employee);
			consumer.accept(str);
		}
	}
}
