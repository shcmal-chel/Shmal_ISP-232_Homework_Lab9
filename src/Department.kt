abstract class Department {
    abstract val departmentName: String
    abstract fun printDepartmentGoal()
}

class DevelopmentDepartment : Department() {
    override val departmentName = "Разработка"

    override fun printDepartmentGoal() {
        println("Цель отдела $departmentName: Писать чистый код")
    }
}

class TestingDepartment : Department() {
    override val departmentName = "Тестирование"

    override fun printDepartmentGoal() {
        println("Цель отдела $departmentName: Находить все баги")
    }
}

fun main() {
    val dev = DevelopmentDepartment()
    val test = TestingDepartment()

    dev.printDepartmentGoal()
    test.printDepartmentGoal()
}