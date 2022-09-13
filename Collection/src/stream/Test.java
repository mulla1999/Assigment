package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.te.list.Employee;

public class Test {
	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee(1, "Amir", 85000), new Employee(2, "Amit", 45000),
				new Employee(3, "Vinayak", 75000), new Employee(4, "komal", 43000));

		Stream<Employee> stream = asList.stream();
		boolean anyMatch = stream.anyMatch((e) -> e.getName().equals("Amir"));
		System.err.println(anyMatch);

		// avoiding duplicate
		// asList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

		// sorting by ID
		// asList.stream().sorted().distinct().collect(Collectors.toList()).forEach(System.out::println);

		// sorting by name
		// asList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
		// .collect(Collectors.toList()).forEach(System.out::println);

		Comparator<Employee> com = (Employee e1, Employee e2) -> {
			return e1.getSalary().compareTo(e2.getSalary());

		};
		Collections.sort(asList, com);
		System.out.println(asList.get(asList.size() - 1));

		// =======Using Stream======with comparator
		Optional<Employee> max = asList.stream().max(com);
		// System.out.println(max.get()+"=====");

		// Using stream along with Function Interface=====
		Function<Employee, Double> f = (e) -> {
			return e.getSalary();

		};

		asList.stream().max(Comparator.comparing(f)).ifPresent(System.out::println);
		// System.out.println(max2.get());

		// Min salary
		asList.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

		// System.out.println(asList);
		// System.out.println(asList.get(asList.size()-1).getName());

		Predicate<Employee> p = (e) -> {
			return e.getSalary() > 50000;
		};

		List<Employee> collect = asList.stream().filter(p).collect(Collectors.toList());
		for (Iterator iterator = collect.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee + " Filter O/P");
		}
	}

}
