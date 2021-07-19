package com.fydia

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.fydia.databinding.ActivityMainBinding
import com.fydia.ui.article.ArticleFragment
import com.fydia.ui.history.HistoryFragment
import com.fydia.ui.home.HomeFragment
import com.fydia.ui.settings.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(HomeFragment())
        binding.bnMain.setOnNavigationItemSelectedListener(this)
    }

    private fun loadFragment(fragment: Fragment): Boolean {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_container, fragment)
            .commit()
        return true
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment: Fragment? = null
        when (item.itemId) {
            R.id.home_menu -> fragment = HomeFragment()
            R.id.article_menu -> fragment = ArticleFragment()
            R.id.history_menu -> fragment = HistoryFragment()
            R.id.settings_menu -> fragment = SettingsFragment()
        }
        return loadFragment(fragment!!)
    }
}