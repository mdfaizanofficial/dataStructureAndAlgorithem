package java8.StreamClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClassImplementation {

    public static void main(String[] args) {
        System.out.println("Running...");

        List<Integer> list = Arrays.asList(3, 6, 1, 40, 54, 34, 43, 22, 10);

        // Stream<Integer> stream = list.stream();
        // stream.forEach(System.out::println);

        // way 1
        // List<Integer> sortedList =
        // list.stream().sorted().collect(Collectors.toList());
        // sortedList.forEach((val) -> System.out.println(val));

        // way 2
        // List<Integer> sortedList2 = list.stream().sorted((o1, o2) -> o2-
        // o1).collect(Collectors.toList());
        // sortedList2.forEach((val) -> System.out.println(val));

        // way 3

        List<Employee> employees = Arrays.asList(new Employee(101, "raj", 10_000),
                new Employee(102, "raj", 20_000),
                new Employee(103, "raj", 5_000),
                new Employee(102, "raj", 2_000),
                new Employee(103, "raj", 55_000));


        // List<Employee> employeesList = employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        // employeesList.forEach((val) -> System.out.println(val));

        List<Employee> employeesFilter = employees.stream()
        .filter((employee) -> employee.getSalary() >= 10000)
        .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        employeesFilter.forEach((val) -> System.out.println(val));


    }

}

class Employee {
    private int id;
    private String name;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

}