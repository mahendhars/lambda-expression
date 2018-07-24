import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTraverseCollection {
	
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("AAA");
		list.add("bbb");
		list.add("CCC");
		list.add("ddd");
		list.add("EEE");
		
		Collections.sort(list);
		
		System.out.println(list);
		
//		Comparator<String> comparator = (str1, str2) -> {
//			return str1.compareToIgnoreCase(str2);
//		};
		
		Collections.sort(list, (str1, str2) -> {
			return str1.compareToIgnoreCase(str2);
		});
		
		System.out.println(list);
		
		// traversing with for each
		for(String str : list) {
			System.out.println(str);
		}
		
		// traversing with forEach method 
		list.forEach((str) -> System.out.println(str));
	}
	
}
