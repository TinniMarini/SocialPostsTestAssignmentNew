import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorsPageTest extends BaseMethods {


    @Test
    public void errorsIsDisplayed() {
        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.urlInput.clear();
        settingsPage.numberInput.clear();
        settingsPage.timeInput.clear();
        settingsPage.saveButton.click();

        Assert.assertTrue(settingsPage.errorURL.isDisplayed());
        Assert.assertTrue(settingsPage.errorNumber.isDisplayed());
        Assert.assertTrue(settingsPage.errorInterval.isDisplayed());

        Assert.assertEquals(settingsPage.errorURL.getText(), "Value can't be blank or value is incorrect");
        Assert.assertEquals(settingsPage.errorNumber.getText(), "Value can't be blank or value is incorrect");
        Assert.assertEquals(settingsPage.errorInterval.getText(), "Value can't be blank or value is incorrect");
    }
}