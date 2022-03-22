import java.util.*

fun tampil(x: Int){
    val fx = 2 * (x*x) + (5*x) - 8
    print("$fx")
}

fun main(){
    val input = Scanner(System.`in`)
    print("Nilai x = ")
    val x = input.nextInt()

    tampil(x)

}