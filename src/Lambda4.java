
public class Lambda4 {
	interface IntegerMath {
		int operation(int a, int b);
	}
	
	public static void main(String[] args) {
		
		IntegerMath obj1 = (a, b) -> {
			return a + b;
		};
		
		IntegerMath obj2 = (a,b) -> a -b;
		
		System.out.println(obj1.operation(10, 40));
		System.out.println(obj2.operation(50, 60));
	}

}
