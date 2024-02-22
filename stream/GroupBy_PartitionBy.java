package stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupBy_PartitionBy {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", "London", 200);
        Employee e2 = new Employee("Bob", "London", 150);
        Employee e3 = new Employee("Charles", "New York", 160);
        Employee e4 = new Employee("Dorothy", "Hong Kong", 190);


        ArrayList<Employee> employees= new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);


        Map<String, List<Employee>> groupByCityName = employees.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println("groupByCityName : "+groupByCityName);

        Map<Boolean, List<Employee>> partitionBy = employees.stream().collect(Collectors.partitioningBy(e -> e.getNoOfSales() >= 160));
        System.out.println("partitionBy : "+partitionBy);


    }
}
