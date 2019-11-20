class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)
operator fun MyDate.component1() = year
operator fun MyDate.component2() = month
operator fun MyDate.component3() = dayOfMonth

fun isLeapDay(date: MyDate): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}
