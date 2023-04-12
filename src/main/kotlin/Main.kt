import model.Developer
import service.DeveloperService
import model.Employee
import service.EmployeeService

fun main() {
    val employeeService = EmployeeService()
    val employee: Employee = employeeService.getEmployeeInfo("Kamran", 26, 7, 500.0)
    println(employee)
    val developerService = DeveloperService()
    val developer: Developer = developerService.getDeveloperInfo("Samir", 34, 5, 1100.0)
    println(developer)
}
