package com.example.tugas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val fragmentManager = supportFragmentManager
        val blankFragment = BlankFragment()
        val fragment = fragmentManager.findFragmentByTag(BlankFragment::class.java.simpleName)

        if (fragment !is BlankFragment) {
            Log.d("Fragment", "Fragment Name :" + BlankFragment::class.java.simpleName)
            fragmentManager
                .beginTransaction()
                .add(R.id.frame_container, blankFragment, BlankFragment::class.java.simpleName)
                .commit()
        }
    }

}