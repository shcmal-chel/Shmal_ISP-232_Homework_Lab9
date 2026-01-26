abstract class Department(
    val departmentName : String
) {
    abstract fun printDepartmentGoal()
}

class DevelopmentDepartment : Department("Разработка"), ReportGenerator {
    override fun printDepartmentGoal() = println("Цель отдела $departmentName: Писать чистый код")
    override fun generateReport(): String = "Отдел: $departmentName, Цель: Писать чистый код"
}

class TestingDepartment : Department("Тестирование"), ReportGenerator {
    override fun printDepartmentGoal() = println("Цель отдела $departmentName: Находить все баги")
    override fun generateReport(): String = "Отдел: $departmentName, Цель: Находить все баги"
}

fun main() {
    val dev = DevelopmentDepartment()
    val test = TestingDepartment()

    dev.printDepartmentGoal()
    test.printDepartmentGoal()
}