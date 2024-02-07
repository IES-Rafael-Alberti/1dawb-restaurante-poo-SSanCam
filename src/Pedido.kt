/**
 * - **Responsabilidades:**
 *   - Mantener un registro de los platos pedidos por un cliente.
 *   - `contPedidos`: Int - No pertenece a ningún pedido en concreto, sino que es un valor global a todos y se utilizará
 *   - para calcular automáticamente los números de los pedidos.
 *
 */
class Pedido(numero: Int, platos: MutableList<Plato>, estado: String) {
    /*
       El número de pedido será calculado automáticamente al crear cada pedido con respecto a un contador
       - que existirá en la clase Pedido.
       fun contadorPedido(){
       TODO("Irá sumando todos los pedidos que se realicen.")
       }
       */
    private var numero: Int = numero
        set(value) {
            field = value
        }

    private var estado: String = "Pendiente"
        set(value) {
            require(estado in ("pendiente, preparación, listo, servido")) { "Se desconoce el estado de preparación del plato." }
            field = value
        }

    //METODOS DE CLASE:
    /**
     * Agregar plato al pedido:
     *
     * @param plato es el plato que vamos a agregar
     * @return Añade un nuevo plato al pedido.
     */
    fun agregarPlato(plato: Plato) {
        TODO("Añade un nuevo plato al pedido.")

    }

    /**
     * Eliminar plato del pedido:
     *
     * @param nombrePlato es el plato que queremos eliminar del pedido.
     * @return El nombre del plato a eliminar de la lista de pedido.
     */
    fun eliminarPlato(nombrePlato: String) {
        TODO("Elimina un plato del pedido basándose en el nombre.")
    }

    /**
     * Calcular precio:
     *
     * @return Devuelve el precio final del pedido.
     */

    fun calcularPrecio() {
        TODO("Calcula el precio total del pedido sumando los precios de cada plato.")
    }

    /**
     * Calcular tiempo
     *
     * @return El tiempo de preparación que dura cada plato.
     */
    fun calcularTiempo() {
        TODO("Calcula el tiempo total de preparación sumando el tiempo de preparación de cada plato.")
    }

    override fun toString(): String {
        TODO(
            "Retornar la información del pedido utilizando el número de mesa, el método toString() de cada plato \n" +
                    "  - y su estado. (por ejemplo, \"Hamburguesa (8 min.) -> 8.99€ (carne, huevo, queso, pan y tomate)\")\n"
        )

        //return super.toString()
    }

}