package entidades


open class Produto(
     private val id: Int,
     var nome: String,
     var valorProduto: Double,
     var tipoProduto: Tipos
) {
    private var valorComDesconto: Double? = null
    constructor(
        id: Int,
        nome: String,
        valorProduto: Double,
        tipoProduto: Tipos,
        valorDesconto: Double?
    ) : this(id, nome, valorProduto, tipoProduto) {

        valorDesconto?.let { it ->
            aplicarDesconto(it)
        }

    }
    fun aplicarDesconto(valor: Double) {
        this.valorComDesconto = valor
    }
    fun obterId():Int{
        return  id
    }


}
