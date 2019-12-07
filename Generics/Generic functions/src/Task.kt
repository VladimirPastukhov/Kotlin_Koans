import java.util.*

fun main(){
    partitionLettersAndOtherSymbols()
    partitionWordsAndLines()
}
fun <N> Collection<N>.partitionTo(
        c1: MutableCollection<N>,
        c2: MutableCollection<N>,
        predicat: (N) -> Boolean): Pair<Collection<N>, Collection<N>>{
    val (one, two) = this.partition(predicat)
    c1 += one
    c2 += two
    return c1 to c2
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e").
            partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
    words == listOf("a", "c")
    lines == listOf("a b", "d e")
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}').
            partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
    letters == setOf('a', 'r')
    other == setOf('%', '}')
}
