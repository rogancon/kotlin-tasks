
package task3

class Tiger(
    runSpeed: Int = DEFAULT_RUN,
    swimSpeed: Int = DEFAULT_SWIM
) : Cat("Tiger", runSpeed, swimSpeed) {

    companion object {
        private const val DEFAULT_RUN = 60
        private const val DEFAULT_SWIM = 10
    }
}
