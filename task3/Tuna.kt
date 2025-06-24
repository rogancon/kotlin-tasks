
package task3

class Tuna(
    swimSpeed: Int = DEFAULT_SWIM
) : Fish("Tuna", swimSpeed) {

    companion object {
        private const val DEFAULT_SWIM = 22
    }
}
