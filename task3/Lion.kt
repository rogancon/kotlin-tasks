
package task3

class Lion(
    runSpeed: Int = DEFAULT_RUN,
    swimSpeed: Int = DEFAULT_SWIM
) : Cat("Lion", runSpeed, swimSpeed) {

    companion object {
        private const val DEFAULT_RUN = 55
        private const val DEFAULT_SWIM = 8
    }
}
