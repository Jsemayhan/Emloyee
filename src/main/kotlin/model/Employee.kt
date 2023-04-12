package model

class Employee(
    private var name: String? = null,
    private var age: Int = 0,
    var salary: Double = 0.0,
    private var workExperience: Int = 0
) {
    override fun toString(): String =
        "Employee{name='$name', age=$age, salary=$salary, workExperience=$workExperience}"
}
