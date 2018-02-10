package zhiyuanzhang.password_validator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.assertion.ViewAssertions.matches;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


import android.support.test.rule.ActivityTestRule;

import org.junit.Test;
import org.junit.Rule;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class EspressoTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("zhiyuanzhang.password_validator", appContext.getPackageName());
    }

    @Rule
    public final ActivityTestRule<MainActivity> main = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void TDDApproach(){
        onView(withId(R.id.validButton));
        onView(withId(R.id.inputText)).perform(typeText("Password2"));
        onView(withId(R.id.validButton)).perform(click());
        onView(withId(R.id.resultText)).check(matches (withText("Strong")));

    }

    @Test
    public void TDDApproach2(){
        onView(withId(R.id.validButton));
        onView(withId(R.id.inputText)).perform(typeText("Password"));
        onView(withId(R.id.validButton)).perform(click());
        onView(withId(R.id.resultText)).check(matches(withText("Strong")));

    }

}
