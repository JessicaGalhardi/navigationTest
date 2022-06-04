package com.example.teste_navegaao_ads_fundamentos_da_computaao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView= findViewById<BottomNavigationView>(R.id.bot_navigation)
        val navController= findNavController(R.id.frag_teste)

        bottomNavigationView.setupWithNavController(navController)

    }
}