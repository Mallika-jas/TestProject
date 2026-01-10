package Acti;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import typeone.Base.BaseTest;
import typeone.Homepage.HomepageTest;
import typeone.Listeners.TestListener;

@Listeners(TestListener.class)
public class Acting extends BaseTest {

    @Test
    public void firsttestcase() {
        HomepageTest ht = new HomepageTest(driver);
        ht.Clickaccount();
        ht.user("mallikahs25@gmail.com");
        ht.pass("Beckman@123");
        Assert.assertTrue(ht.isUserLoggedIn(driver), "User should be logged in");
    }

}






