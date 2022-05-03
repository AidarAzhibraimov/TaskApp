package com.kg.geektech.taskapp.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItemU(): ShopItem

    // Можно менять
    fun getShopList(): List<ShopItem>

}