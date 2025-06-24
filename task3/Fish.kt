
package task3

/**
 * Рыбы умеют только плавать.
 */
abstract class Fish(
    private val speciesName: String,
    override val swimSpeed: Int
) : Pet(swimSpeed = swimSpeed), Swimmable {

    override fun swim() = println("I am a $speciesName, and i swimming")
}
