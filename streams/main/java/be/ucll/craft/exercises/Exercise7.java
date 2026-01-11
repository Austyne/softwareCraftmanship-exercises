package be.ucll.craft.exercises;

import be.ucll.craft.domain.Department;
import be.ucll.craft.domain.Project;

import java.util.List;

public class Exercise7 {

    public static double calculateMegaBudget(List<Department> departments) {

        // Goal: Calculate the "Mega Budget" (Sum of all budgets, including inactive)
        // using reduce()
        // without using sum(), starting with 0.0
        return departments.stream()
                .flatMap(d -> d.employees().stream())
                .flatMap(e -> e.projects().stream())
                .distinct()
                .map(Project::budget)
                .reduce(0.0, Double::sum);
        }


    }

