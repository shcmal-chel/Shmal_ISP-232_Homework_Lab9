class Employee : ReportGenerator {
    var fullName: String = ""
    var position: String = ""
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Warning!!! Зарплата не может быть отрицательной!")
            } else {
                field = value
            }
        }
    var yearsOfExperience: Int = 0
        set(value) {
            if (value > 50) {
                println("Warning!!! Опыт работы не может быть больше 50 лет!")
            } else {
                field = value
            }
        }
    var currentTask: Task? = null

    // 2. Добавьте метод assignTask
    fun assignTask(newTask: Task) {
        if (currentTask != null && currentTask?.isCompleted == false) {
            println("Сотрудник $fullName уже занят задачей")
        } else {
            currentTask = newTask
            println("Сотруднику $fullName назначена задача")
        }
    }
    override fun generateReport(): String {
        return "Сотрудник: $fullName, Должность: $position, Зарплата: $salary, Опыт: $yearsOfExperience лет"
    }
}


fun main() {
    val worker = Employee()
    worker.fullName = "Иван Иванов"
    worker.position = "Программист"

    val task1 = Task("Купить молоко", "Зайти в магазин", Priority.MEDIUM, false)
    val task2 = Task("Написать код", "Разработать модуль", Priority.HIGH, false)
    val task3 = Task("Протестировать", "Проверить баги", Priority.MEDIUM, true)

    worker.assignTask(task1)
    worker.assignTask(task2) // уже занят
    task1.isCompleted = true
    worker.assignTask(task3)

    println(worker.generateReport())
}