interface ReportGenerator {
    fun generateReport(): String
}

fun main() {
    val dev = DevelopmentDepartment()
    val test = TestingDepartment()

    dev.printDepartmentGoal()
    test.printDepartmentGoal()

    val reports: List<ReportGenerator> = listOf(
        Employee(),
        dev,
        test
    )

    for (report in reports) {
        println(report.generateReport())
    }
}