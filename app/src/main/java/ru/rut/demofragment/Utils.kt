package ru.rut.demofragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit

fun replaceFragment(supportFragmentManager: FragmentManager, fragment : Fragment, id : Int){
    supportFragmentManager.commit {
        setCustomAnimations(
            R.anim.slide_in,
            R.anim.fade_out,
            R.anim.fade_in,
            R.anim.slide_out
        )
        replace(id, fragment)
        addToBackStack(null)
    }

}