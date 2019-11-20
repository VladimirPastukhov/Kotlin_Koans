class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = object : Iterator<MyDate> {
        var next: MyDate = start.copy()
        override fun next(): MyDate {
            val current = next;
            next = next.nextDay()
            return current;
        }

        override fun hasNext(): Boolean {
            return next <= end
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
