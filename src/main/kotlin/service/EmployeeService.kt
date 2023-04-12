package service

import model.Employee
import util.SalaryCalculation

class EmployeeService : SalaryCalculation() {
    override fun calculateSalary(workExperience: Int, defaultSalary: Double): Double {
        return if (workExperience > 6) {
            defaultSalary * 2
        } else defaultSalary
    }

    fun getEmployeeInfo(
        name: String?, age: Int, workExperience: Int, defaultSalary: Double
    ): Employee {
        val employee = Employee(name, age, defaultSalary, workExperience)
        val empSalary = calculateSalary(workExperience, defaultSalary)
        employee.salary = empSalary
        return employee
    }
}
