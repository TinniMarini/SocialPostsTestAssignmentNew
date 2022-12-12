import org.testng.Assert;
import org.testng.annotations.Test;

public class SaveButtonAndPostListTest extends BaseMethods {

    @Test
    public void saveButtonAndPostList() {
        SettingsPage settingsPage = new SettingsPage(driver);
        PostsListPage postsListPage = new PostsListPage(driver);
        settingsPage.saveButton.click();
        Assert.assertEquals(postsListPage.postsHeader.getText(), "Posts list");
        Assert.assertTrue(postsListPage.postDate.isDisplayed());
        Assert.assertTrue(postsListPage.authorName.isDisplayed());
        Assert.assertTrue(postsListPage.postBody.isDisplayed());
    }
}
