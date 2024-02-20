package com.example.b5standardapp.kotlinexs.lamdas

import com.example.b5standardapp.kotlinexs.Demo


data class Item(val name: String, val price: Float)                                         // 1

data class Order(val items: Collection<Item>)

val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

fun main() {
    println("Max priced item value: ${order.maxPricedItemValue()}")


}

fun Order.maxPricedItemValue(): Float {
    return order.items.maxByOrNull{it.price}?.price?:0f
} // 2
