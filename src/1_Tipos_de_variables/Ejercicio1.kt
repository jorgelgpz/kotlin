package `1_Tipos_de_variables`

fun main() {
    // Todas las variable "val" son inmutables
    // Variable inmutable de tipo entero
    val edad: Int
    edad = 48
    // Variable inmutable de tipo decimal
    val sueldo: Float
    sueldo = 1200.55f // siempre lleva una "f" al final del valor
    // Variable inmutable de tipo decimal
    val total: Double
    total = 70000.24
    // Variable inmutable de tipo alfanumérico
    val titulo: String
    titulo = "Sistema de Ventas"

    // Variable mutable, las variable mutables empiezan con "var"
    var mes: Int
    mes = 1
    //algunas líneas más de código
    mes = 2
    // Variable de tipo Char, almacena un unico carácter
    var continua: Char = 's'
    // Variable de tipo Booleano, true o false
    var fin: Boolean = false

    print("Jorge\n")
    print("Luis")

    println("Gonzalez")
    println("Perez")

    println(mes)
}

