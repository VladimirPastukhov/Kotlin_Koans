import java.util.HashMap

fun buildMap(fill: HashMap<Int, String>.() -> Unit): HashMap<Int, String>{
    val map = HashMap<Int, String>()
    map.fill()
    return map;
}

fun usage(): Map<Int, String> {
    return buildMap {
        this.put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
