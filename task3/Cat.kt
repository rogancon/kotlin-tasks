
package task3

/**
 * Кошачьи умеют бегать и плавать.
 */
abstract class Cat(
    private val speciesName: String,
    override val runSpeed: Int,
    override val swimSpeed: Int
) : Pet(runSpeed, swimSpeed), Runnable, Swimmable {

    override fun run() = println("I am a $speciesName, and i running")
    override fun swim() = println("I am a $speciesName, and i swimming")
}
