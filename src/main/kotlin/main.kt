fun main() {
    val price = 10002
    val regularCustomers = false
    val sale1 = price - 100
    val sale2 = price * 0.05
    val vip = price * 0.01
    val vipSale1 = sale1 - (sale1 * 0.01)
    val vipSale2 = sale2 - (sale2 * 0.01)





    if (price <= 1000) {
        println("К оплате: $price")
    } else if (price > 1000 && price <= 10000) {
        println("После применения 100 рублей скидки: $sale1")
    } else if (price > 10000) {
        println("После применения 5% скидки: ${price - sale2}")
    }
    if (price <= 1000 && regularCustomers === true) {
        println("После применения 1% скидки: ${price - vip}")
    } else if (price > 1000 && price <= 10000 && regularCustomers === true) {
        println("После применения 1% скидки: $vipSale1")
    } else if (price > 10000 && regularCustomers === true) {
        println("После применения 1% скидки: $vipSale2")
    }
}