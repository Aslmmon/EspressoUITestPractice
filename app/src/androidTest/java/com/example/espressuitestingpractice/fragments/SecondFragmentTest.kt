package com.example.espressuitestingpractice.fragments

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.espressuitestingpractice.R
import org.junit.Assert.*
import org.junit.Test

class SecondFragmentTest{
    @Test
    fun test_isSecondFragmentWithBundleDisplayed(){
        val bundle = Bundle()
        bundle.putString("text","eshta 3lek")
        launchFragmentInContainer<SecondFragment>(bundle, R.style.AppTheme)
        onView(withId(R.id.tv_data_recieved)).check(matches(withText("eshta 3lek")))
    }
}