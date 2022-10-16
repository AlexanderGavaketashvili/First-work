import java.util.DoubleSummaryStatistics
import kotlin.jvm.internal.Reflection

fun main() {
    val f1=Point(x = 1, y = 3)
    val f2=Point(x = 2, y = 6)

    println(f1.toString())
    println(f1)

    println(f1==f2)
}
class Point(x:Int, y:Int) {
    var x: Int = x
    var y: Int = y

    override fun toString(): String {
        return "$x / $y"
    }

    override fun equals(other: Any?): Boolean =
        other is Point && other.x == x
    fun Reflection(): String {
        var Reflectionx= -x
        var Reflectiony= -y

        return "{$Reflectionx / $Reflectiony"
    }
    fun truncate(x: Double, y:Double) {

    }


}


