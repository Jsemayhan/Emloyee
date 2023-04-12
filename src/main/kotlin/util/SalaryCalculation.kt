package util

abstract class SalaryCalculation {
    abstract fun calculateSalary(
        workExperience: Int, defaultSalary: Double
    ): Double
}
