/**
 * Integra y gestiona las operaciones del restaurante.
 *
 *              **Premisas y Requisitos:**
 * - La capacidad de una mesa debe ser un número positivo.
 * - El estado de la mesa debe ser manejado adecuadamente para reflejar si está libre, reservada u ocupada.
 *
 */
class sistemaGestionRestaurante(private val mesas: MutableList<Mesa>) {


    //METODOS DE CLASE
    /**
     * Realizar pedido:
     *
     */
    fun realizarPedido(numeroMesa: Int, pedido: Pedido){
        TODO("Asocia un nuevo pedido a una mesa. Debe verificar que la mesa \n" +
                "      esté ocupada antes de asociar el pedido.")
    }

    /**
     * Cerrar Pedido:
     *
     */
    fun cerrarPedido (numeroMesa: Int, numeroPedido: Int){
        TODO("Si el númeroPedido es null, cambia el estado del último pedido \n" +
                "      de una mesa a \"servido\". Si le llega un numeroPedido, entonces debe buscar el pedido con dicho número y cambiar su estado a \"servido\".\n")
    }

    /**
     * Cerrar mesa:
     *
     */
    fun cerrarMesa(numeroMesa: Int){
        TODO("Si todos los pedidos están servidos, libera la mesa.")
    }

    /**
     * Buscar platos:
     */
    fun buscarPlatos(){
        TODO("Retorna una lista con el nombre de los platos pedidos. Si no hay ninguno retorna null.")
    }

    /**
     * Contar plato
     *
     */
    fun contarPlato(nombre: String){
        TODO("Cuenta el número de veces que se ha pedido un plato. Si no hay ninguno retorna null.")
    }

    /**
     * Buscar plato más pedido:
     */
    fun buscarPlatoMasPedido() {
        TODO("Busca y retorna el o los platos más pedidos. Si no hay ninguno retorna null. Utiliza los dos métodos anteriores.")
    }
}