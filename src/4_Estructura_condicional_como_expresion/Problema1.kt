package `4_Estructura_condicional_como_expresion`

/*
Problema 1: Determinar el número con mayor valor absoluto
Enunciado:
Solicita al usuario ingresar dos números enteros
(pueden ser negativos). Luego, determina cuál de los
dos tiene mayor valor absoluto y muestra ese número en pantalla.
 */

fun main() {
    print("Ingrese el primer número: ")
    val num1 = readln().toInt()
    print("Ingrese el segundo número: ")
    val num2 = readln().toInt()

    val mayorValorAbsoluto = if (kotlin.math.abs(num1) > kotlin.math.abs(num2)) num1 else num2

    println("El número con mayor valor absoluto es: $mayorValorAbsoluto")
}
