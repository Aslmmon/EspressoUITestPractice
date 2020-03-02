package com.example.espressuitestingpractice

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.Intents.intending
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.BoundedMatcher
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressuitestingpractice.activities.MainActivity
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.core.IsNot.not
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class CameraIntentActivityTest{

    @get:Rule
    val intentsTestRule = IntentsTestRule(CameraIntentActivity::class.java)

    @Test
    fun test_cameraIntent_isBitmapSetToImageView() {

        // GIVEN
        val activityResult = createImageCaptureActivityResultStub()
        val expectedIntent: Matcher<Intent> = hasAction(MediaStore.ACTION_IMAGE_CAPTURE)
        intending(expectedIntent).respondWith(activityResult)

        // Execute and Verify
        onView(withId(R.id.image)).check(matches(not(ImageViewHasDrawabale.hasDrawabale())))
        onView(withId(R.id.button_launch_camera)).perform(click())
        intended(expectedIntent)
        onView(withId(R.id.image)).check(matches(ImageViewHasDrawabale.hasDrawabale()))

    }


    private fun createImageCaptureActivityResultStub(): Instrumentation.ActivityResult? {
        val bundle = Bundle()
        bundle.putParcelable(
            KEY_IMAGE_DATA, BitmapFactory.decodeResource(
                intentsTestRule.activity.resources,
                R.drawable.ic_launcher_background
            )
        )
        val resultData = Intent()
        resultData.putExtras(bundle)
        return Instrumentation.ActivityResult(Activity.RESULT_OK, resultData)
    }
}

object  ImageViewHasDrawabale{
    fun hasDrawabale():BoundedMatcher<View,ImageView>{
        return object :BoundedMatcher<View,ImageView>(ImageView::class.java){
            override fun describeTo(description: Description?) {
                description?.appendText("has drawabale")
            }

            override fun matchesSafely(item: ImageView?): Boolean {
                return item?.drawable != null
            }

        }
    }
}