fun main(){
    try {
        var da: Boolean
        var S_p: Double
        println("Первая сторона отверстия")
        var x1 = readln().toDouble()
        println("Вторая сторона отверстия")
        var x2 = readln().toDouble()

        var S_k: Double
        println("Первая сторона кирпича")
        var z1 = readln().toDouble()
        println("Вторая сторона кирпича")
        var z2 = readln().toDouble()
        println("Третья сторона кирпича")
        var z3 = readln().toDouble()
        
        when(x1 > 0 && x2 > 0 && z1 > 0 && z2 > 0 && z3 > 0){
            true -> da = true
            false -> da = false
        }
        if (da == true) {
            S_p = x1 * x2
            S_k = 2 * (z1 * z2 + z2 * z3 + z1 * z3)
            when (S_k < S_p){
                true -> println("Кирпич войдет")
                false -> println("Кирпич не войдет")
            }
        }else{
            println("Не верный формат")
        }

    }catch (e:Exception){
        println("Не верный формат")
    }
}
