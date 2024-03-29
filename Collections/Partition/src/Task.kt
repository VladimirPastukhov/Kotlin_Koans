// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.partition {
    it.orders.filter { !it.isDelivered }.size > it.orders.filter { it.isDelivered }.size
}.first.toSet()
