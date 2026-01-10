package Acti;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import typeone.Base.BaseTest;
import typeone.Homepage.Saved_cart;
import typeone.Listeners.TestListener;

@Listeners(TestListener.class)
public class Saved_cart_test extends BaseTest {

   
    @Test
    public void secondtestcase() {
        Saved_cart sv = new Saved_cart(driver);
        sv.coll_verify();
        sv.dele_coll();
    }
}







	






