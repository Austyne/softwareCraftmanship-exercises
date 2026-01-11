package be.ucll.craft.exercises;

import be.ucll.craft.domain.Department;
import be.ucll.craft.domain.Employee;
import be.ucll.craft.domain.Project;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    /**
     * Goal: Pair every "Developer" from "Tech" with every "Manager" from "HR".
     * meaning: first of developers with first of managers,
     * second of developers with second of managers, etc.
     * Returns strings in format: "DevName is mentored by MgrName"
     */
    public static List<String> createMentorshipPairs(List<Department> departments) {

        // 2 intermediate lists
        List<Employee> techDevs = null;

        List<Employee> hrManagers = null;

        // TODO Implement the pairing logic here
        return null;
    }
}

