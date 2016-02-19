import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.*;


public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Add Word");
  }

  @Test
  public void displayWordTest() {
    goTo("http://localhost:4567/");
    fill("#word").with("dog");
    submit(".btn");
    assertThat(pageSource()).contains("DOG");
  }

  @Test
  public void displayDefintionTest() {
    goTo("http://localhost:4567/");
    fill("#word").with("dog");
    submit(".btn");
    click("a", withText("DOG"));
    fill("#definition").with("man's best friend");
    submit("#defButton");
    assertThat(pageSource()).contains("man's best friend");
  }
}
