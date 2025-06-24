
package task3

class Salmon(
    swimSpeed: Int = DEFAULT_SWIM
) : Fish("Salmon", swimSpeed) {

    companion object {
        private const val DEFAULT_SWIM = 18
    }
}
