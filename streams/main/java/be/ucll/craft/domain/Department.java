package be.ucll.craft.domain;

import java.util.List;

public record Department(String name, List<Employee> employees) {}