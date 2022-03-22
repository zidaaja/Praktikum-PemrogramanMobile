import java.security.Principal
import java.util.*


fun main(){
    val input = Scanner(System.`in`)
    print("Input bilangan = ")
    var bilangan = input.nextInt()
    var i=0;
    var kelipatan = bilangan


    while (i<5){
        bilangan += kelipatan
        if ((bilangan % 2 == 0) or (bilangan % 3 == 0)){
            print("$bilangan ")
            i++
        }
    }
}