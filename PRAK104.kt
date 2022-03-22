class Otomotif(val jenis : String, val bahanBakar : String){
    fun nyala(){
        println("$jenis dinyalakan !")
        println("")
    }
    fun mati(){
        println("$jenis dimatikan !")
        println("")
    }
    fun mengisiBahanBakar(){
        println("$jenis sedang mengisi bahan bakar $bahanBakar")
        println("")
    }
    fun jalan(){
        println("$jenis Sedang berjalan!")
        println("")
    }
    fun stop(){
        println("$jenis berhenti.")
        println("")
    }
}

fun main(){
    val kereta = Otomotif("kereta", "batubara")
    kereta.mati()
    kereta.jalan()
    kereta.mengisiBahanBakar()
    kereta.stop()
}