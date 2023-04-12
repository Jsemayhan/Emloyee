package model

data class Developer(
        private var name: String,
        private var age: Int,
        var salary: Double,
        private var workExperience: Int
) {
    override fun toString(): String =
            "Developer{name='$name', age=$age, salary=$salary, workExperience=$workExperience}"
}
