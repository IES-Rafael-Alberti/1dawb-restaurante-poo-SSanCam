/**
 * - **Responsabilidades:**
 *   - Mantener un registro de los platos pedidos por un cliente.
 *   - `contPedidos`: Int - No pertenece a ningún pedido en concreto, sino que es un valor global a todos y se utilizará
 *   - para calcular automáticamente los números de los pedidos.
 *
 */
class Pedido(numero: Int, private val platos: MutableList<Plato>, estado: String = "Pendiente") {
    /*
       El número de pedido será calculado automáticamente al crear cada pedido con respecto a un contador
       - que existirá en la clase Pedido.
       fun contadorPedido(){
       TODO("Irá sumando todos los pedidos que se realicen.")
       }
       */
    var numero: Int = numero
        set(value) {
            field = value
        }

    private var estado: String = estado
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
        platos.add(plato)
    }

    /**
     * Eliminar plato del pedido:
     *
     * @param nombrePlato es el plato que queremos eliminar del pedido.
     * @return El nombre del plato a eliminar de la lista de pedido.
     */
    fun eliminarPlato(nombrePlato: String) {
        platos.removeIf { it.nombre == nombrePlato }
    }

    /**
     * Calcular precio:
     *
     * @return "Calcula el precio total del pedido sumando los precios de cada plato."
     *
     */
    fun calcularPrecio(): Double {
        var precioPedido = 0.0

        for (plato in platos) {
            precioPedido += plato.precio
        }
        return String.format("%.2f", precioPedido).toDouble()
    }

    /**
     * Calcular tiempo
     *
     * @return Calcula el tiempo total de preparación sumando el tiempo de preparación de cada plato.
     */
    fun calcularTiempo(): Int {
        var tiempoTotal = 0

        for (plato in platos) {
            tiempoTotal += plato.tiempoPreparacion
        }
        return tiempoTotal
    }

    /**
     * Retorna una representación en forma de cadena de caracteres del pedido, incluyendo la información de cada plato
     * y su estado.
     *
     * @return Una cadena que representa el pedido, con cada plato seguido de su estado y sus detalles, formateados de la siguiente manera:
     *         "Nombre del plato (Tiempo de preparación) -> Precio (Ingredientes)"
     *         Por ejemplo: "Hamburguesa (8 min.) -> 8.99€ (carne, huevo, queso, pan y tomate)"
     */

    override fun toString(): String {
        val stringBuilder = StringBuilder()

        for (plato in platos) {
            stringBuilder.append("${plato.nombre} (${plato.tiempoPreparacion}) -> (${plato.ingredientes.joinToString(", ")})")
        }
        return stringBuilder.toString()
    }
}