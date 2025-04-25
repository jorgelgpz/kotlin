package `6_Condiciones_compuestas_operadores_logicos`
/*
Se carga una fecha (día, mes y año) por teclado.
Mostrar un mensaje si corresponde al primer trimestre
del año (enero, febrero o marzo)
 */
fun main() {
    print("Ingrese día:")
    val dia: Int = readln().toInt()
    print("Ingrese mes:")
    val mes: Int = readln().toInt()
    print("Ingrese Año:")
    val año: Int = readln().toInt()
    if (mes == 1 || mes == 2 || mes == 3)
        print("Corresponde al primer trimestre");
}

