/**
 * В переменной likes хранится число лайков.
 * Приложение выводит в консоль соответствующий вариант: людям или человеку, в зависимости от того,
 * что хранится в likes
 */

fun main() {
    val likes = 31
    val result = if (likes % 10 == 1 && likes % 100 != 11 || likes == 1) "человеку" else "людям"
    println("Понравилось: $likes $result")
}