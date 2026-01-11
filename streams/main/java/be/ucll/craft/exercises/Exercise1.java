package be.ucll.craft.exercises;

import be.ucll.craft.domain.Department;
import be.ucll.craft.domain.Employee;

import java.util.List;

public class Exercise1 {
    public static List<String> getNamesOfEmpoyeesOlderThan30(List<Department> departments) {
        // TODO Implement this method


        return departments.stream()
                .flatMap(department -> department.employees().stream())
                .filter(emp -> emp.age()>30)
                .map(Employee::name)
                .toList();
    }
}
