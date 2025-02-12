fun main(){
    try {
        println("Введите трехзначное число")
        var x = readln().toInt()
        var first = x/100%10
        var second = Math.abs(x%10)
        when (first == second){
            true -> println("цифры равны: $first $second")
            false -> println("Цифры не равны: $first $second")
        }
    }catch (e:Exception){
        println("Не верный формат")
    }
}