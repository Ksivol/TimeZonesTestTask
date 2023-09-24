package com.ksivol_project.timezonestesttask

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

object FragmentManager {
    var currentFrag: Fragment? = null

    fun setFragment(activity: AppCompatActivity, newFrag: Fragment) {
        val transaction = activity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameStartView, newFrag)
        transaction.commit()
        currentFrag = newFrag
    }
}