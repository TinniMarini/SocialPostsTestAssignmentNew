import org.testng.Assert;
import org.testng.annotations.Test;

public class ResetButtonTest extends BaseMethods {


    @Test
    public void resetButtonIsWorked() {
        SettingsPage settingsPage = new SettingsPage(driver);

        String url = settingsPage.urlInput.getText();
        settingsPage.urlInput.clear();
        String urlClear = settingsPage.urlInput.getText();
        Assert.assertNull(urlClear);
        String number = settingsPage.numberInput.getText();
        settingsPage.numberInput.clear();
        String numberClear = settingsPage.numberInput.getText();
        Assert.assertNull(numberClear);
        String interval = settingsPage.timeInput.getText();
        settingsPage.timeInput.clear();
        String intervalClear = settingsPage.timeInput.getText();
        Assert.assertNull(intervalClear);
        settingsPage.resetButton.click();

        Assert.assertEquals(url, "https://run.mocky.io/v3/27a44f7d-67ca-4e96-b901-a159d315b922");
        Assert.assertEquals(number, "15");
        Assert.assertEquals(interval, "00:30");
    }
}
