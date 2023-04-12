package service

import model.Developer
import util.SalaryCalculation

class DeveloperService : SalaryCalculation() {
    override fun calculateSalary(workExperience: Int, defaultSalary: Double): Double {
        return if (workExperience >= 5) {
            defaultSalary / 2 * 3
        } else 0.0
    }

    fun getDeveloperInfo(
        name: String, age: Int, workExperience: Int, defaultSalary: Double
    ): Developer {
        val developer = Developer(name, age, defaultSalary, workExperience)
        val devSalary = calculateSalary(workExperience, defaultSalary)
        developer.salary = devSalary
        return developer
    }
}
