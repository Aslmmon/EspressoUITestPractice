package com.example.espressuitestingpractice

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Test

class NavigationTest {
    @Test
    fun test_navigationBetweenFragments() {
        //setup
        ActivityScenario.launch(ThirdActivity::class.java)
        // nav Directi. to
        onView(withId(R.id.btn_goTOSecond)).perform(click())
        //verify
        onView(withId(R.id.second_fragment_parent)).check(matches(isDisplayed()))
        pressBack()
        onView(withId(R.id.first_fragment_parent)).check(matches(isDisplayed()))


    }
}