package com.indialone.multiplebackstackdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.indialone.multiplebackstackdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private var navController: LiveData<NavController>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        if (savedInstanceState == null) {
            setUpBottomNav()
        }

    }

    private fun setUpBottomNav() {
        val graphs = listOf(
            R.navigation.home_nav_graph,
            R.navigation.notification_nav_graph,
            R.navigation.account_nav_graph
        )

        val controller = mBinding.bottomNavigation.setupWithNavController(
            graphs,
            supportFragmentManager,
            R.id.nav_host_fragment_activity_main,
            intent
        )

        controller.observe(this) {
            setupActionBarWithNavController(it)
        }

        navController = controller

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController?.value?.navigateUp()!! || super.onSupportNavigateUp()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setUpBottomNav()
    }
}