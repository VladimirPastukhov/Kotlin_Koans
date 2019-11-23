fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            var index = 0;
            products.forEach {
                index++
                var row = 0;
                tr {
                    td(getCellColor(index, row++)) {
                        text(it.description)
                    }
                    td(getCellColor(index, row++)) {
                        text(it.price)
                    }
                    td(getCellColor(index, row++)) {
                        text(it.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
