package be.ucll.craft.exercises;

import be.ucll.craft.domain.Department;
import be.ucll.craft.domain.Project;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
    /**
     * Goal: Find the names of the top 3 most expensive projects across the company,
     *       sorted by budget descending.
     *       Return strings in format: "ProjectName ($Budget)"
     */
    public static List<String> topThreeMostExpensiveProjects(List<Department> departments) {

        return departments.stream()
                .flatMap(d -> d.employees().stream())
                .flatMap(e -> e.projects().stream())
                .distinct()
                .sorted(Comparator.comparingDouble(Project::budget).reversed())
                .limit(3)
                .map(p -> p.name() + " ($" + p.budget()+ ")")
                .toList();
    }

}

