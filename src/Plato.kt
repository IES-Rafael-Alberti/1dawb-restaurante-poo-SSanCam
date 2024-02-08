/**
 **Premisas y Requisitos:**
 * El nombre del plato no puede ser vacío.
 * El precio del plato debe ser mayor que 0.
 * El tiempo de preparación no podrá ser igual o inferior a 1.
 * Un ingrediente no puede ser vacío.
 * Considerar el uso de propiedades de Kotlin para validar automáticamente estas restricciones tanto al crear un plato
 * cómo al modificar sus valores.
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