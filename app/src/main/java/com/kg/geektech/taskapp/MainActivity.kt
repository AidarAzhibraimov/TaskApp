package com.kg.geektech.taskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.kg.geektech.taskapp.domain.ShopItem
import com.kg.geektech.taskapp.presentation.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()
        initObservers()
    }

    private fun initObservers() {
        viewModel.getShopList()

        //get shopList
        viewModel.shopListLD.observe(this){
            Toast.makeText(applicationContext, it.toString() , Toast.LENGTH_SHORT).show()
        }

        //add shopItem
        viewModel.addShopItem(ShopItem("potato", 2,true))
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }
}