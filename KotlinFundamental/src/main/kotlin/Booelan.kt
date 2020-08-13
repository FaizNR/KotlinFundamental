fun main() {

    val nilai = 75
    val Hasil : Char

    Hasil = if (nilai >= 90 && nilai <= 100){
        'A'
    }else if  (nilai >= 80  && nilai <= 89){
        'B'
    }else if (nilai >= 70 && nilai <= 79){
        'C'
    }else if (nilai >= 60 && nilai <= 69){
        'D'
    }else if (nilai <60){
        'E'
    }else{
        'N'
    }
    print ("Predikat : $Hasil")
}