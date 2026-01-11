package be.ucll.craft.exercises;

import be.ucll.craft.domain.Department;
import be.ucll.craft.domain.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise3 {

    // Goal: Find the list of unique skills possessed by employees,
    // grouped by the Department name.
    // Structure needed: Map<String, List<String>>
    // where Key = Dept Name, Value = Set of unique Skills
    public static Map<String, Set<String>> getUniqueSkillsByDepartment(List<Department> departments) {
        // TODO Implement this method

        return departments.stream()
                .collect(Collectors.toMap(
                        Department::name,
                        d -> d.employees().stream()
                                .flatMap(e -> e.skills().stream())
                                .collect(Collectors.toSet())
                ));


    }
}
