import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CalcTests extends Base {

    @Test
    public void testAddition() {

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_02"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_add"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_03"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_equal"))).click();

        String result = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/txtCalc"))).getText();

        Assert.assertEquals("Result of 2 + 3 not 5","5", result);

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/history_button"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/historyList")));

        String historyExpression =
                driver.findElement(By.id("com.sec.android.app.popupcalculator:id/historyExpression")).getText();

        Assert.assertEquals("Expression was not stored in history","2+3", historyExpression);

        String historyResult =
                driver.findElement(By.id("com.sec.android.app.popupcalculator:id/historyResult")).getText();

        Assert.assertEquals("Result was not stored in history","=5", historyResult);

    }

    @Test
    public void testSubtraction() {

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_01"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_00"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_sub"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_02"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_equal"))).click();

        String result = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/txtCalc"))).getText();

        Assert.assertEquals("Result of 10 - 2 not 8","8", result);

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/history_button"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/historyList")));

        String historyExpression =
                driver.findElement(By.id("com.sec.android.app.popupcalculator:id/historyExpression")).getText();

        Assert.assertEquals("Expression was not stored in history","10\u22122", historyExpression);

        String historyResult =
                driver.findElement(By.id("com.sec.android.app.popupcalculator:id/historyResult")).getText();

        Assert.assertEquals("Result was not stored in history","=8", historyResult);

    }

    @Test
    public void testFactorial() {

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_parenthesis"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_01"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_00"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_sub"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_02"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_parenthesis"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_mul"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_parenthesis"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_02"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/tv_1st_2nd"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_e"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_parenthesis"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_equal"))).click();

        String result = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/txtCalc"))).getText();

        Assert.assertEquals("Result of (10 - 2) * 2 ! not 16","16", result);

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/history_button"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/historyList")));

        String historyExpression =
                driver.findElement(By.id("com.sec.android.app.popupcalculator:id/historyExpression")).getText();

        Assert.assertEquals("Expression was not stored in history","(10\u22122)" + (char) 215 + "(2!)", historyExpression);

        String historyResult =
                driver.findElement(By.id("com.sec.android.app.popupcalculator:id/historyResult")).getText();

        Assert.assertEquals("Result was not stored in history","=16", historyResult);

    }


    @Test
    public void testSin() {

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_sin"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_03"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_00"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/bt_equal"))).click();

        String result = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/txtCalc"))).getText();

        Assert.assertEquals("Result of sin(30) not 0.5","0.5", result);

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/history_button"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.sec.android.app.popupcalculator:id/historyList")));

        String historyIndicator =
                driver.findElement(By.id("com.sec.android.app.popupcalculator:id/deg_rad_history_indicator")).getText();

        Assert.assertEquals("Indicator incorrectly stored in history","Deg", historyIndicator);

        String historyExpression =
                driver.findElement(By.id("com.sec.android.app.popupcalculator:id/historyExpression")).getText();

        Assert.assertEquals("Expression was not stored in history","sin(30)", historyExpression);

        String historyResult =
                driver.findElement(By.id("com.sec.android.app.popupcalculator:id/historyResult")).getText();

        Assert.assertEquals("Result was not stored in history","=0.5", historyResult);

    }

}
