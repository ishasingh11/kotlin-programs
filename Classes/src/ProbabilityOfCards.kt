import java.util.*


class Deck(x: Int) {

    var deck = mutableListOf(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13)
    fun remove(card: Int, c: Char): Int {
        deck.remove(card)
        return 0
    }
    fun probability(num: Int): Int {
        val decksize = deck.size
        val counts: MutableMap<Int, Int> = HashMap()

        for (num in deck) {
            if (counts.containsKey(num)) {
                counts[num] = counts[num]!! + 1
            } else {
                counts[num] = 1
            }
        }
        var y: Int = counts[num]!!
        return (y * 1000) / decksize
    }
}


fun main() {
    val read = Scanner(System.`in`)

    var x = read.nextInt()
    val d = Deck(x)

    while (x != -1) {
        when(x) {
            1 -> {
                val card = read.nextInt()
                val suite = read.next()[0]
                d.remove(card, suite)
            }
            2 -> {
                val card = read.nextInt()
                println(d.probability(card))
            }
            }
        x = read.nextInt()
        }
    }