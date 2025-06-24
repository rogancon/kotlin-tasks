
package task3

/**
 * Базовый класс питомца.
 */
abstract class Pet(
    /** Скорость бега (км/ч) или 0, если не бегает. */
    open val runSpeed: Int = 0,
    /** Скорость плавания (км/ч) или 0, если не плавает. */
    open val swimSpeed: Int = 0
) {
    /** Суммарная скорость — сумма всех доступных скоростей. */
    val totalSpeed: Int get() = runSpeed + swimSpeed
}
