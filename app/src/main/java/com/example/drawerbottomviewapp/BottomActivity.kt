package com.example.drawerbottomviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomActivity : AppCompatActivity() {
    private lateinit var bnvMenu:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom)

        var inicioFragment = HomeFragment()
        var MensajeFragment = MessageFragment()
        var PerfilFragment = PerfilFragment()

        setFragmentActual(inicioFragment)

        bnvMenu = findViewById(R.id.bnv_Menu)
        bnvMenu.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> {
                    setFragmentActual(inicioFragment)
                }
                R.id.nav_message -> {
                    setFragmentActual(inicioFragment)
                }
                R.id.nav_galery -> {
                    setFragmentActual(inicioFragment)
                }
                
            }
        }
    }

    private fun setFragmentActual(fragment: Fragment) = supportFragmentManager.beginTransaction().apply{
        replace(R.id.dl_Vista, fragment)
        commit()
    }
}