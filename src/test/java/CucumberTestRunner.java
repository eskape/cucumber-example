import com.xebia.models.CucumberReporting;
import org.junit.runner.JUnitCore;

public class CucumberTestRunner {
    public static void main(String[] args) throws Exception {
        JUnitCore.runClasses(CucumberTestSuite.class);
        CucumberReporting.generateReport();
    }
}
