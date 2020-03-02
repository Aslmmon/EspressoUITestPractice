package com.example.espressuitestingpractice

import com.example.espressuitestingpractice.fragments.FirstFragmentTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    SecondActivityTest::class,
    NavigationTest::class,
    FirstFragmentTest::class,
    SecondActivityTest::class,
    ImageIntentActivityTest::class
)
class ActivityTestSuite