package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Customer.isFrom(city: City): Boolean = this.city.equals(city)

fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all { it.city.equals(city) }

fun Shop.hasCustomerFrom(city: City): Boolean = customers.any { it.city.equals(city) }

fun Shop.countCustomersFrom(city: City): Int = customers.count { it.city.equals(city) }

fun Shop.findAnyCustomerFrom(city: City): Customer? = customers.find { it.city.equals(city) }
