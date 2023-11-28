import entidades.Produto
import entidades.Tipos
import java.util.*

class Eletronico(
    id: Int,
    nome: String,
    valorProduto: Double,
    tipoProduto: Tipos,
    valorDesconto: Double?
):Produto(id, nome, valorProduto, tipoProduto,valorDesconto){
    override fun toString(): String {
        return "Eletronico(Nome : ${this.nome}, Valor: ${this.valorProduto})"
    }

}class Moveis(
    id: Int,
    nome: String,
    valorProduto: Double,
    tipoProduto: Tipos,
    valorDesconto: Double?
):Produto(id, nome, valorProduto, tipoProduto,valorDesconto){

    override fun toString(): String {
        return "Eletronico(Nome : ${this.nome}, Valor: ${this.valorProduto})"
    }
}
class Alimentos(
    id: Int,
    nome: String,
    valorProduto: Double,
    tipoProduto: Tipos,
    valorDesconto: Double?
):Produto(id, nome, valorProduto, tipoProduto,valorDesconto){

    override fun toString(): String {
        return "Eletronico(Nome : ${this.nome}, Valor: ${this.valorProduto})"
    }
}

