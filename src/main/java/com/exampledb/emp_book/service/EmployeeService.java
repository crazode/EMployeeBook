package com.exampledb.emp_book.service;

import com.exampledb.emp_book.modal.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
