import jdk.jfr.Description
import javax.print.attribute.standard.JobPriority

data class Task(
    var tile: String,
    var description: String,
    var priority: Priority,
    var isCompleted: Boolean = false
)
enum class Priority{
    LOW,
    MEDIUM,
    HIGH
}
fun main(){
    var task_1 = Task("Купить молоко","Зайти в магазин (желательно взять по скидке)",Priority.MEDIUM,false)
    task_1.hashCode()
    var task_2 = Task("Купить пиву","Зайти в магазин (желательно взять пачпорт)",Priority.MEDIUM,false)
    task_2.copy()
    var task_3 = Task("Закончить школу","Закончить обучение в школе и уйти после 9 класса", Priority.HIGH, true)
    task_3.toString()
    task_3.equals(1)

}