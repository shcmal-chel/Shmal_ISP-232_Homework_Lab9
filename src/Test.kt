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
