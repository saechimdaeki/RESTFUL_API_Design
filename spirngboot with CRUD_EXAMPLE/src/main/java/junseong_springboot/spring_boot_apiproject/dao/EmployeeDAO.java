package junseong_springboot.spring_boot_apiproject.dao;

import junseong_springboot.spring_boot_apiproject.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
