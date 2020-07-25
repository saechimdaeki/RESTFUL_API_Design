package junseong_springboot.spring_boot_apiproject.controller;

import junseong_springboot.spring_boot_apiproject.model.Employee;
import junseong_springboot.spring_boot_apiproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> get(){
        return employeeService.get();
    }
    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee){
        employeeService.save(employee);
        return employee;
    }
    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id){
        return employeeService.get(id);
    }
}
