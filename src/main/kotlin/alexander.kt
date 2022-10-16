fun main() {
    val f1=Point(x = 1, y = 3)
    val f2=Point(x = 2, y = 6)

    println(f1.toString())
    println(f1)

    println(f1==f2)
}
class Point(x:Int, y:Int) {
    private var x: Int = x
    private var y: Int = y

    override fun toString(): String {
        return "$x / $y"
    }

    override fun equals(other: Any?): Boolean =
        other is Point && other.x == x
}
class Fraction() {
    var x=null
    var y=null
}

