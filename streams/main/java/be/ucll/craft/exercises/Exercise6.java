package be.ucll.craft.exercises;

import be.ucll.craft.domain.Department;
import be.ucll.craft.domain.Employee;

import java.util.List;
import java.util.Optional;

public class Exercise6 {
    // Goal:
    // 1. Check if ANY department has an employee younger than 25.
    public static boolean hasEmployeeYoungerThan25(List<Department> departments) {

        // TODO Implement this method
        return departments.stream()
                .flatMap(department -> department.employees().stream())
                .anyMatch(e -> e.age()< 25);
    }

    // 2. Find ANY employee who knows "Cloud" (return Optional).
    public static String findCloudSpecialist(List<Department> departments) {

        Optional<Employee> cloudExpert =departments.stream()
                .flatMap(department -> department.employees().stream())
                .filter(e-> e.skills().contains("Cloud"))
                .findAny();

        // TODO Implement the stream to find the employee with "Cloud" skill
        // return "Found Cloud Expert:  + name()" or "No Cloud Expert Found"
        return cloudExpert
                .map(employee -> "found Cloud Expert: " + employee.name())
                .orElse("not found");
    }

}
