package ayhan.service;

import ayhan.model.Employee;
import ayhan.util.SalaryCalculation;

public class EmployeeService extends SalaryCalculation {
    @Override
    public double calculateSalary(int workExperience,double defaultsalary) {
        if(workExperience>6){
            return defaultsalary*2;

        }
        return defaultsalary;
    }
    public Employee getEmployeeInfo(String name,
                                    int age,
                                    int workExperience,
                                    double defalultsalary){
        Employee employee=new Employee();
        employee.setName(name);
        employee.setAge(age);
        employee.setWorkExperience(workExperience);
        double empSalary=calculateSalary(workExperience,defalultsalary);
         employee.setSalary(empSalary);
        return employee;
    }
}
