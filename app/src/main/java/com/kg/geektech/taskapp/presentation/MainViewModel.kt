package com.kg.geektech.taskapp.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kg.geektech.taskapp.data.ShopListRepositoryImpl
import com.kg.geektech.taskapp.domain.*

class MainViewModel: ViewModel() {

    private val repositoryImpl = ShopListRepositoryImpl()

    private val addShopItemUseCase = AddShopItemUseCase(repositoryImpl)

    private val getShopListUseCase = GetShopListUseCase(repositoryImpl)

    private val deleteShopItemUseCase = DeleteShopItemUseCase(repositoryImpl)

    private val getShopItemUseCase = GetShopItemUseCase(repositoryImpl)

    private val editShopItemUseCase = EditShopItemUseCase(repositoryImpl)

    val shopListLD = MutableLiveData<List<ShopItem>>()

    fun editShopItem(shopItem: ShopItem){
        editShopItemUseCase.editShopItem(shopItem)
    }

    fun getShopItem(shopItem: ShopItem){
        getShopItemUseCase.getShopItem(shopItem)
    }

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun getShopList(){
        shopListLD.value = getShopListUseCase.getShopList()
        getShopListUseCase.getShopList()
    }

    fun addShopItem(shopItem: ShopItem){
        addShopItemUseCase.addShopItem(shopItem)
    }

}