import kotlin.math.log
import kotlin.math.log10
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    try {
        var a= readln()!!.toInt()
        var b= readln()!!.toDouble()
        var c= readln()!!.toInt()
        var d= readln()!!.toInt()
        var n=readln()!!.toInt()
        var ten=10!!.toDouble()
       var  output=(0.25*(a-b))/(1/8-((Math.abs(b))/
               ((ten.pow(n+3))+(log(b,10.0))/(c-d))))
        print("${String.format("%.3f",output)}")
    }catch (e:Exception)
    {
        println("Error")
    }
}