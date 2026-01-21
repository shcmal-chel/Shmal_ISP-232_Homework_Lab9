class Employee {
    var fullName: String = ""
        get() = ""

    var position: String = ""
        get() = ""

    var salary: Int
        get() = 0
        set(value){
            if (value < 0){
                println("Warning!!!")
            } else {
                salary = value
            }
        }

    var yearsOfExperience: Int
        get() = 0
        set (value){
            if (value > 50){
                println("Warning!!!")
            } else {
                value
            }
        }
}

fun main(){
    var worker = Employee()
    worker.fullName = "Виталий Кузьма Михайлович"
    worker.position = "Трудовик"
    worker.salary = -100
    worker.yearsOfExperience = 60
}