import com.sun.tools.javac.Main
import entidades.Produto
import entidades.Tipos


fun main(args: Array<String>) {
    var fone = Eletronico(1, "FONE", 135.0, Tipos.ELETRONICO,100.00)
    var televisao = Eletronico(2, "TELEVISAO", 85.0, Tipos.ELETRONICO,60.00)
    var suplemento_alimentar = Alimentos(3, " WEY", 100.0, Tipos.ALIMENTO,null)
    var sofa = Moveis(4, "SOFA", 50.0, Tipos.ALIMENTO,null)
    var vitamina = Alimentos(5, "VITAMINA", 70.0, Tipos.ALIMENTO,50.00)

    val mapaEstoque = mutableMapOf<Int,Produto>()
    mapaEstoque[fone.obterId()] = fone
    mapaEstoque[televisao.obterId()] = televisao
    mapaEstoque[suplemento_alimentar.obterId()] = suplemento_alimentar
    mapaEstoque[sofa.obterId()] = sofa
    mapaEstoque[vitamina.obterId()] = vitamina

    mapaEstoque.forEach{ (chave,valor) ->
        println("chave : ${chave} \n Nome : ${valor.nome}     Valor : ${valor.valorProduto}")
    }

    println("\nProdutos Menores Que 90   ")
    val valoresMenoresQue90 = mapaEstoque.filter { it ->
        it.value.valorProduto <= 90
    }
    valoresMenoresQue90.values.forEach{it ->
        println("chave : ${it.obterId()} \n Nome : ${it.nome}     Valor : ${it.valorProduto}")
    }
    println("Listagem de Todos os Produtos")
    var nomeDeTodosOsProdutos = mapaEstoque.values.map { it.nome }
    nomeDeTodosOsProdutos.forEach{it ->
        println(it.uppercase())
    }
    println("Apenas Produtos Eletronicos")
    var apenasEletronicos= mapaEstoque.values.filter { it ->
        it.tipoProduto == Tipos.ELETRONICO
    }
    println("Eletronicos presentes no estoque")
    println(apenasEletronicos.toString())

    val fimDaExecucao = false
    println("Deseja Cadastrar algum produto?  /n 0 NAO   1 SIM")
    val opc = readln().toIntOrNull()
    when(opc){
        0 -> {
            println("fim do programa")
        }
        1 -> {
            println("Informe o id")

            val inputIdUser:Int? = readln().toIntOrNull()
            var produto: Produto? = null
            inputIdUser?.let { it ->
                val idProdutos= mapaEstoque.map { it.value.obterId() }
                val verificacao:Produto? = mapaEstoque[it]
                verificacao?.let { it ->
                    println(it.toString())
                }.run {  }
            }



        }

    }




}

