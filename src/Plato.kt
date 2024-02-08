/**
 * Representa la información de un plato.
 *
 * @param nombre : String - Nombre del plato.
 * @param precio : Double - Precio del plto
 * @param tiempoPreparacion : Int - Indica el tiempo estimado para preparar el plato en minutos.
 * @param ingredientes: List<String> - Lista de ingredientes necesarios para el plato.
 */
class Plato(
    nombre: String,
    precio: Double,
    tiempoPreparacion: Int,
    val ingredientes: MutableList<String>
) {

    var nombre: String = nombre
        set(value) {
            require(nombre.isBlank()) { "El campo 'nombre' no puede estar vacío para un plato." }
            field = value
        }

    var precio: Double = precio
        set(value) {
            require(precio > 0.0) { "El campo 'precio' debe ser superior a 0, queremos hacernos ricos." }
            field = value
        }

    var tiempoPreparacion: Int = tiempoPreparacion
        set(value) {
            require(tiempoPreparacion > 1) { "El campo 'tiempo' no puede ser igual o menor a 1, no hacemos magia." }
            field = value
        }

    //METODOS DE CLASE:
    /**
     * Agregar ingredientes: Añade un nuevo ingrediente a la lista de ingredientes del plato.
     *
     * @param ingrediente Es el ingrediente que vamos a agregar a la lista de ingredientes del plato.
     */
    fun agregarIngrediente(ingrediente: String) {
        require(ingrediente.isBlank()) { "El campo 'ingrediente no puede estar vacío." }
        ingredientes.add(ingrediente)
    }

    override fun toString(): String {
        return ("$nombre ($tiempoPreparacion min.) -> $precio (${ingredientes.joinToString { " y " }}) y ")
    }

}