import java.util.*

class PRAK101 (val waktu : String, val nama : String, val umur : Int) {
    fun Print(){
        val suhu = (35..38).random().toFloat()
        println("Suhu Tubuh Anda : $suhu")
        println("");
        println("Selamat $waktu, $nama. Umur anda $umur Tahun.")
        println("Suhu tubuh anda $suhu derajat Celcius.")
    }
}

fun main(){
    val input = Scanner(System.`in`)

    print("Waktu Sekarang : ")
    val waktu = input.nextLine()

    print("Nama Anda : ")
    val nama = input.nextLine()

    print("Umur Anda : ")
    val umur = input.nextInt()

    val sapa = PRAK101(waktu, nama, umur)
    sapa.Print();

}
