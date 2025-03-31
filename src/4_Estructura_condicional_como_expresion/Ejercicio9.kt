package `4_Estructura_condicional_como_expresion`
/*
Ingresar por teclado un valor entero.
Se almacena en una variable el cuadrado de dicho número
si el valor ingresado es par, en caso que sea impar
se guardar el cubo.
 */
fun main() {
    print("Ingrese un valor entero:")
    val valor = readln().toInt()
    val resultado = if (valor % 2 == 0) {
        print("Cuadrado: ")
        valor * valor
    } else {
        print("Cubo: ")
        valor * valor * valor
    }
    print(resultado)
}
