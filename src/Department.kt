abstract class Department(
    val departmentName : String
) {
    fun printDepartmentGoal(){
        println("Цель отдела: $departmentName")
    }
}
abstract class DevelopmentDepartment: Department("Отдел полиции"){
    printDepartmentGoal()
}
abstract class TestingDepartment: Department("Отдел Полиции")