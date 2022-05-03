package com.kg.geektech.taskapp.data

import com.kg.geektech.taskapp.domain.ShopItem
import com.kg.geektech.taskapp.domain.ShopListRepository



class ShopListRepositoryImpl: ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var autoincrementId = 0

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID){
            shopItem.id = autoincrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {

    }

    override fun getShopItemU(): ShopItem {
        TODO("Not yet implemented")
    }

    override fun getShopList(): List<ShopItem> = shopList.toList()

    private fun updateList(){

    }

}