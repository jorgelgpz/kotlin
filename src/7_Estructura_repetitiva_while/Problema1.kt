package `7_Estructura_repetitiva_while`

fun main() {
    var x = 1
    var conta1 = 0
    var conta2 = 0
    while (x <= 10) {
        print("Ingrese nota:")
        val nota = readln().toInt()
        if (nota >= 7)
            conta1 = conta1 + 1
        else
            conta2 = conta2 + 1
        x = x + 1
    }
    println("Cantidad de alumnos con notas mayores o iguales a 7: $conta1")
    println("Cantidad de alumons con notas menores a 7: $conta2")
}