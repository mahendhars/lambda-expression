import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class Lambda2 {
	
	public static void main(String args[]) {
		
		IntFunction<String> intFunction1 = num -> {
			return Integer.toString(num);
		};
		System.out.println(intFunction1.apply(1234).length());
		
		//static method reference using ::
		IntFunction<String> intFunction2 = Integer::toString;
		System.out.println(intFunction2.apply(1234).length());
		
		//lambdas made using a constructor
		Function<String, BigInteger> function = BigInteger::new;
		System.out.println(function.apply("1234"));
		
		//example of a lambda made from an instance method
		Consumer<String> consumer = System.out::println;
		consumer.accept("1234");
		
		//these two are the same using the static method concat		
		UnaryOperator<String> greeting = x -> "Hello, ".concat(x);
        System.out.println(greeting.apply("World"));
        
        UnaryOperator<String> operator = "Hello, "::concat;
        System.out.println(operator.apply("Peggy"));
	}
}
