package com.example.espressuitestingpractice.fragments

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressuitestingpractice.R
import org.junit.Test

class FirstFragmentTest {

    @Test
    internal fun isTextInFirstFragmentVisibile() {

        launchFragmentInContainer<FirstFragment>(null, R.style.AppTheme)
        onView(withId(R.id.tv_first)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.btn_goTOSecond)).check(ViewAssertions.matches(ViewMatchers.withText("Go To Second Fragment")))


    }

}