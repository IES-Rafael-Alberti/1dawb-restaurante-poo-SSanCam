/**
 * - Representa una mesa en el restaurante.
 *
 * - **Propiedades:**
 * @param numero: Int - Número de la mesa.
 * @param capacidad: Int - Capacidad máxima de personas que pueden sentarse en la mesa. Solo existen mesas de 1 a 6 comensales.
 * @param estado: String - Estado de la mesa (por ejemplo, "libre", "reservada y "ocupada").
 * @param pedidos: List<Pedido> - Lista de pedidos realizados por la mesa.
 *
 */
class Mesa(numero: Int, capacidad: Int, estado: String, pedidos: List<Pedido>) {

    var numero: Int = numero

        set(value) {
            field = value
        }
    var capacidad: Int = capacidad
        set(value) {
            require(capacidad in 1..<6) { "Las mesas tienen una capacidad máxima para 6 comensales." }
            field = value
        }
    var estado: String = estado
        set(value) {
            require(estado !in listOf("libre", "reservado", "ocupado")) { "Se desconoce el estado de la mesa." }
            field = value
        }

    var pedidos: List<Pedido> = pedidos
        set(value) {

            field = value
        }

    //METODOS DE CLASE:
    /**
     * Ocupar mesa:
     * Cambia el estado de la mesa a "ocupada", pero solo si la mesa está en estado "libre".
     *
     */
    fun ocuparMesa() {
        if (estado == "libre"){
            estado = "ocupado"
        }
    }

    /**
     * Ocupar reserva: Cambia el estado de la mesa a "ocupada", pero solo si la mesa está en estado "reservada".
     */
    fun ocuparReserva() {
        if (estado == "resservada"){
            estado = "ocupado"
        }
    }

    /**
     * Liberar mesa : Cambia el estado de la mesa a 'libre'
     */
    fun liberarMesa() {
        estado = "libre"
    }

    /**
     * Agregar pedido: Agrega un pedido a los pedidos de la mesa.
     *
     */
    fun agregarPedido(pedido: Pedido) {

    }
}
