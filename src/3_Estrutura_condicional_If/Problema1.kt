package `3_Estrutura_condicional_If`

/*
Se ingresan tres notas de un alumno, si el promedio es mayor
o igual a siete mostrar un mensaje "Promocionado".
 */

fun main() {
    print("Ingrese primer nota:")
    val nota1: Int = readln().toInt()
    print("Ingrese segunda nota:")
    val nota2: Int = readln().toInt()
    print("Ingrese tercer nota:")
    val nota3: Int = readln().toInt()
    var promedio: Int = (nota1 + nota2 + nota3) / 3
    if (promedio >= 7)
        println("Promocionado")
}