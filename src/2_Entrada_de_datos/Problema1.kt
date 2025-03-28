package `2_Entrada_de_datos`

/*
Escribir un programa en el cual se ingresan cuatro números
enteros, calcular e informar la suma de los dos primeros
y el producto del tercero y el cuarto.
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
    val suma: Int = v1 + v2
    println("La suma de $v1 y $v2 es $suma")
    val producto: Int = v3 * v4
    println("El producto de $v3 y $v4 es $producto")
}