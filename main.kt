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


fun main () {
    var valor = 120;
    println(atividade5(valor))
}
