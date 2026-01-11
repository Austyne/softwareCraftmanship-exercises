package be.ucll.craft.data;

import be.ucll.craft.domain.Department;
import be.ucll.craft.domain.Employee;
import be.ucll.craft.domain.Project;

import java.util.List;

public class DataService {
    public final static List<Department> SAMPLE_DATA;

    // Initialize sample data
    // Java has no static constructors, but we can use a
    // static initializer block that is executed when the class is loaded
   static {
        // Projects
        Project p1 = new Project("Website Redesign", 5000.0, true);
        Project p2 = new Project("Database Migration", 12000.0, true);
        Project p3 = new Project("Legacy Cleanup", 2000.0, false);
        Project p4 = new Project("Hiring Campaign", 3000.0, true);

        // Employees Tech
        Employee e1 = new Employee("Alice", 28, "Developer",
                List.of("Java", "SQL"), List.of(p1, p2));
        Employee e2 = new Employee("Bob", 35, "Architect",
                List.of("Java", "Cloud", "Architecture"), List.of(p2, p3));

        // Employees HR
        Employee e3 = new Employee("Charlie", 40, "Manager",
                List.of("Recruiting", "Management"), List.of(p4));
        Employee e4 = new Employee("Dana", 24, "Recruiter",
                List.of("LinkedIn", "Communication"), List.of(p4));

        // Departments
        Department tech = new Department("Tech", List.of(e1, e2));
        Department hr = new Department("HR", List.of(e3, e4));

       SAMPLE_DATA =   List.of(tech, hr);
    }
}
