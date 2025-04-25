package `5_Estructuras_condicionales_anidadas`

/*
Problema 1
Se ingresa por teclado un valor entero, mostrar una
leyenda que indique si el número es positivo,
nulo(cero) o negativo.
 */
fun main() {
    print("Ingrese un valor entero:")
    val valor = readln().toInt()
    if (valor == 0)
        println("Se ingresó el cero")
    else
        if (valor > 0)
            println("Se ingresó un valor positivo")
        else
            println("Se ingresó un valor negativo")
}