import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda1 {

	public static void main(String[] args) {
		Predicate<String> predicate = (str) -> str.length() > 10;
		System.out.println("Apple is more than 10 chars: " + predicate.test("apple"));
		
		Consumer<String> consumer = (str) -> System.out.println(str.toLowerCase());
		consumer.accept("WTF");
		
		Function<Integer, String> function = (integer) -> Integer.toString(integer);
		System.out.println(function.apply(new Integer(1000)));

		Supplier<String> supplier = () -> "How ya doin";
		System.out.println(supplier.get());
		
		UnaryOperator<String> unaryOperator = (str) -> str.toUpperCase();
		System.out.println(unaryOperator.apply("wtf"));
		
		BinaryOperator<String> binaryOperator = 
				(str1, str2) -> str1.toUpperCase() + " : " + str2.toUpperCase();
		System.out.println(binaryOperator.apply("wtf", "seriously"));
		
		CustomFunctionalInterface customFunctionalInterface =
				str -> str;
		System.out.println(customFunctionalInterface.sayWatever("WTF"));
		
		Runnable runnable = () -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("I am a thread");
		};
		new Thread(runnable);
		
		Employee employee = new Employee();
		employee.setAge(100);
		employee.setEmailAddress("wtf@shit.com");
		employee.setGender(Employee.Sex.MALE);
		employee.setName("****ed Up");
		
		Employee.processEmployee(employee, 
				emp -> emp.getAge() > 20,
				emp -> emp.getName(),
				str -> System.out.println(str));
		
		processEmployeeGeneric(employee, 
				emp -> emp.getAge() > 20,
				emp -> emp.getName(),
				str -> System.out.println(str));
		
	}
	
	public static <X,Y> void  processEmployeeGeneric(X x, Predicate<X> predicate, 
			Function<X, Y> function, Consumer<Y> consumer) {
		if (predicate.test(x)) {
			Y y = function.apply(x);
			consumer.accept(y);
		}
	}
}
