package HtmlResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class Ebay {
    Document doc;

    @BeforeClass
    public void start() throws IOException {
    doc =Jsoup.connect("https://www.ebay.com/").get();
}

    @Test
    public void test01() throws IOException {
    Element content1 = doc.getElementById("gh-logo");
        Assert.assertEquals(content1.attr("width"),"250");
}
   @Test
    public void test02() throws IOException {
        Element content2 = doc.getElementById("gh-logo");
        Assert.assertEquals(content2.attr("height"),"200");
    }

    @Test
public void test03() throws IOException {
        Element content4 = doc.getElementById("gh-cat");
        Assert.assertEquals(content4.attr(content4.text()),"category");
    }}


