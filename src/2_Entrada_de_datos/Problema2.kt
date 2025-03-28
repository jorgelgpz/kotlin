package `2_Entrada_de_datos`

/*
Realizar un programa que lea por teclado cuatro valores
numéricos enteros e informe su suma y promedio.
*/

fun main() {
    print("Ingrese primer valor:")
    val v1: Int = readln().toInt()
    print("Ingrese segundo valor:")
    val v2: Int = readln().toInt()
    print("Ingrese tercer valor:")
    val v3: Int = readln().toInt()
    print("Ingrese cuarto valor:")
    val v4: Int = readln().toInt()
    val suma: Int = v1 + v2 + v3 + v4
    println("La suma de los cuatro valores es $suma")
    val prom: Int = suma / 4
    println("El promedio de los cuatro valores es $prom")
}