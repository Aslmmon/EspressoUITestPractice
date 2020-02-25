package com.example.espressuitestingpractice

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SecondActivityTest {


    @get:Rule
    var activityRule: ActivityTestRule<SecondActivity> = ActivityTestRule(SecondActivity::class.java)

    @Test
    fun test_visibility_textOfSecondActivity() {
        Espresso.onView(ViewMatchers.withId(R.id.tv_second_activity))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun test_visibility_buttonBack() {
        Espresso.onView(ViewMatchers.withId(R.id.btn_back))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }



}