package com.example.espressuitestingpractice

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.espressuitestingpractice.activities.MainActivity
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {


    @Test
    fun test_activityInView() {
//        // this scenario will launch this specific Activity Isolated for this Test function
        val senario =
            ActivityScenario.launch(MainActivity::class.java)      //senario.moveToState(Lifecycle.State.CREATED)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_text_button() {

        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.tv_main)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_next)).check(matches(isDisplayed()))

    }

    @Test
    fun test_titleOfText_isDiplayedExactly() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.tv_main)).check(matches(withText(R.string.first_activity)))
    }


    @Test
    fun test_nextBtnNavigateToSecondryActivity() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.btn_next)).perform(click())
        onView(withId(R.id.second_activity)).check(matches(isDisplayed()))
    }

    @Test
    fun test_backButtonInSecondActivity_toNavigateToMainActivity() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.btn_next)).perform(click())
        onView(withId(R.id.second_activity)).check(matches(isDisplayed()))
        pressBack()
        // or         onView(withId(R.id.btn_back)).perform(click))
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }
}