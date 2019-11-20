// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
//    val allProducts = customers.flatMap { it.orders }.flatMap { it.products }.toMutableSet()
    val poducts = customers.first().orders.flatMap{it.products}.toMutableSet()
    return customers.fold(poducts){pr, customer ->
        pr.removeIf { !customer.orders.flatMap { it.products }.contains(it) }
        pr
    }.toSet()
}
