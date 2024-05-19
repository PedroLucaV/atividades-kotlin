fun atividade1(lista: List<Int>): Int {
    return lista.filter { it % 2 == 0 }.sum();
}

fun atividade2(lista: List<String>): String? {
    val contador = mutableMapOf<String, Int>();

    for (string in lista) {
        contador[string] = contador.getOrDefault(string, 0)+1;
    }
    var maisRepetida: String? = null;
    var maxContagem = 0

    for ((string, cont) in contador) {
        if (cont > maxContagem) {
            maisRepetida = string
            maxContagem = cont
        } else {
            maisRepetida = "Não há string mais repetida"
        }
    }

    return maisRepetida;
}

fun atividade3(senha: String): Boolean {
    if (senha.length < 8) {
        return false;
    }

    var validaSenha = false;
    var maiuscula = false;
    var minuscula = false;
    var numero = false;

    for (caracter in senha) {
        when {
            caracter.isUpperCase() -> maiuscula = true;
            caracter.isLowerCase() -> minuscula = true;
            caracter.isDigit() -> numero = true;
        }
    }
	
    if (maiuscula == true && minuscula == true && numero == true){
        validaSenha = true;
    }
    return validaSenha;
}

fun atividade4(lista: List<String>): MutableList<String> {
    var maisQue5Digitos = listOf<String>().toMutableList();
    for (string in lista) {
        if (string.length > 5){
            maisQue5Digitos.add(string);
        }
    }

    return maisQue5Digitos;
}

fun atividade5(valor: Number): Float {
    var precoFinal: Float;
    val valorFloat = valor.toFloat();

    if (valorFloat > 100) {
        precoFinal = valorFloat - (valorFloat * 0.1f);
    } else {
        precoFinal = valorFloat;
    }

    return precoFinal;
}


fun atividade6(lista: List<Int>): Int? {
    fun ePrimo(numero: Int): Boolean {
        if (numero <= 1) {
            return false
        }
        for (i in 2 until numero) { //valida se o numero dividido por algum numero menor que ele (apartir de 2) da um resto igual a 0, se der, ele não é primo (False)
            if (numero % i == 0) {
                return false
            }
        }
        return true
    }

    var maiorPrimoEncontrado: Int = 0;
    for (numero in lista) {
        if (ePrimo(numero)) {
            if (maiorPrimoEncontrado == null || numero > maiorPrimoEncontrado) {
                maiorPrimoEncontrado = numero
            }
        }
    }
    return maiorPrimoEncontrado
}

fun atividade7(lista: List<Int>): Int {
    var soma: Int = 0;
    for (numero in lista) {
        if (numero % 3 == 0 || numero % 5 == 0) {
            soma += numero;
        }
    }
    return soma;
}

fun atividade8(lista: List<String>): List<String>{
    return lista.sortedWith(compareBy { it.lowercase() });
}

fun atividade9(entrada: Pair<Int, Int>, saida: Pair<Int, Int>): Int{
    return saida.first - entrada.first;
}

fun atividade10(lista: List<Int>): List<Int> {
    val par = lista.filter { it % 2 == 0 };
    val impar = lista.filter { it % 2 != 0 };
    return par + impar //Concatena por serem 2 listas
}

fun atividade11(numero: Int): Int {
    var num = numero;
    var invertido = 0;
    while (num != 0) {
        val digito = num % 10; //ultimo digito
        invertido = invertido * 10 + digito; //o do meio e o primeiro somado ao ultimo
        num /= 10 // condicao para repetir o do while
    }
    return invertido;
}

fun atividade12(ano: Int): Boolean {
    return ano % 4 == 0
}

fun atividade13(altura: Double, peso: Double){
    //IMC com peso e altura
}

fun atividade14(frase: String): Int{
    return frase.length;
}

fun atividade15(lista: List<Int>): Int{
    val listaUnica = lista.distinct();
    return listaUnica.sum()
}

fun main () {
    println(atividade15(listOf(1, 2, 3, 3, 4, 5, 5, 6)))
}
