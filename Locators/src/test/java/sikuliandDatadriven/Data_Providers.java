package sikuliandDatadriven;
import org.testng.annotations.DataProvider;

public class Data_Providers {
    @DataProvider(name="regTests")
    public static Object[][] wikilist() {
        Object[][] obj = {{"Automation","Automation"},{"Israel","Israel"},{"BlahBlah","Search results"}};
        return obj;
    }

}
