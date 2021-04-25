package com.example.intercrew;

import android.widget.TextView;

import androidx.test.annotation.UiThreadTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.example.intercrew.Admin.Signin_Admin;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class MainActivityAdminTest {

    @Rule
    public ActivityTestRule<Signin_Admin> mActivityTestRule = new ActivityTestRule<>(Signin_Admin.class);
    private Signin_Admin mActivity = null;
    private TextView username,pw;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }


    @Test
    @UiThreadTest
    public void checkEmail() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.username));
        assertNotNull(mActivity.findViewById(R.id.password));

        username = mActivity.findViewById(R.id.username);
        username.setText("user1");
        String email = username.getText().toString();
        assertNotEquals("user", email);

        pw = mActivity.findViewById(R.id.password);
        pw.setText("user1");
        String pass = pw.getText().toString();
        assertNotEquals("user", pass);
    }

}
