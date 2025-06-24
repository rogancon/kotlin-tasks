
package task3

fun main() {
    val tiger = Tiger()
    tiger.run()
    tiger.swim()
    println("Tiger total speed = ${tiger.totalSpeed}")

    val salmon = Salmon()
    salmon.swim()
    println("Salmon total speed = ${salmon.totalSpeed}")
}
