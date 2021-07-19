package com.fydia.ui.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.fydia.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}