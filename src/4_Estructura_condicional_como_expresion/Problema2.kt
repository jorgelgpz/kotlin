package `4_Estructura_condicional_como_expresion`


fun main() {
    print("Ingrese su edad: ")
    val edad = readln().toInt()

    val clasificacion = if (edad < 13) {
        "Niño"
    } else if (edad in 13..17) {
        "Adolescente"
    } else {
        "Adulto"
    }

    println("Clasificación: $clasificacion")
}
