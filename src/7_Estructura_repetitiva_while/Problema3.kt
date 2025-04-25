package `7_Estructura_repetitiva_while`

fun main() {
    print("Cuantos empleados tiene la empresa:")
    val n = readln().toInt()
    var x = 1
    var conta1 = 0
    var conta2 = 0
    var gastos = 0.0
    while (x <= n) {
        print("Ingrese el sueldo del empleado:")
        val sueldo = readln().toDouble()
        if (sueldo <= 300)
            conta1 = conta1 + 1
        else
            conta2 = conta2 + 1
        gastos = gastos + sueldo;
        x = x + 1
    }
    println("Cantidad de empleados con sueldos entre 100 y 300: $conta1")
    println("Cantidad de empleados con sueldos mayor a 300: $conta2")
    System.out.print("Gastos total de la empresa en sueldos: $gastos")
}