package `3_Estrutura_condicional_If`

/*
Se ingresa por teclado un número entero comprendido entre 1 y 99,
mostrar un mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos
dígitos, un número entero)
 */

fun main() {
    print("Ingrese un valor comprendido entre 1 y 99:")
    val num: Int = readln().toInt()
    if (num < 10)
        println("Tiene un dígito")
    else
        println("Tiene dos dígitos")
}
