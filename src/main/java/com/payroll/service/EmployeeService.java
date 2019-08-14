package com.payroll.service;

import com.payroll.domain.User.Employee;
import com.payroll.repository.EmployeeRepository;
import com.payroll.repository.Interface.IEmployeeRepository;
import com.payroll.service.Interface.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("EmployeeImpl")
public class EmployeeService  implements IEmployeeService {
    @Autowired
    @Qualifier("EmpInMemory")
    private IEmployeeRepository repository;
    private static IEmployeeService service = null;

    private EmployeeService(){
        this.repository = EmployeeRepository.getRepository();
    }

    public static IEmployeeService getEmployeeService(){
        if (service == null) service = new EmployeeService();
        return service;
    }

    @Override
    public Employee create(Employee employee) {
        return repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.update(employee);
    }

    @Override
    public Employee read(String s) {
        return repository.read(s);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }


    @Override
    public Set<Employee> getAll() {
        Set<Employee> employee = this.repository.getAll();
        System.out.println("All in set " + employee);
        return employee;
    }
}
