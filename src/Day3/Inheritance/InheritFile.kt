package Day3.Inheritance

fun main() {
    var init89321 = SmartPhone()
    var init76543 = BasicPhone()

    println("${init89321.name} is an ${init89321.type} phone")
    println("${init76543.name} is a ${init76543.type} phone")

    init89321.getDeviceInfo()

}