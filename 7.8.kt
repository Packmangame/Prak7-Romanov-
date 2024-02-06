import kotlin.math.pow

fun main() {
    try {
        var x=-2/3!!.toDouble()
        var z=(5*x.pow(3)+70*x.pow(2)+14*x
                ==Math.abs(5*x.pow(2)+70*x+14)*x)
        print(z)
    }catch (e:Exception)
    {
        println("Error")
    }
}