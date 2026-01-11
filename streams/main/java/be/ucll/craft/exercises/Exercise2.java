package be.ucll.craft.exercises;

import be.ucll.craft.domain.Department;
import be.ucll.craft.domain.Project;

import java.util.List;

public class Exercise2 {
    public static double getTotalBudgetOfActiveProjectsInDepartment(List<Department> departments, String departmentName) {
        // TODO Implement this method
        return departments.stream()
                .filter(department -> department.name().equals(departmentName))
                .flatMap(department -> department.employees().stream())
                .flatMap(employee -> employee.projects().stream())
                .distinct()
                .mapToDouble(Project::budget)
                .sum();


    }
}
