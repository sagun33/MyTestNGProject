package automationexercises.utility;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
    @DataProvider
    public Object[][] kullaniciBilgileri() {


        String path="./src/test/java/resources/dataMyTest1.xlsx";
        String sheetName ="Sayfa1";
        ExcelUtils excelUtils = new ExcelUtils(path,sheetName);
        Object[][] bilgiler =excelUtils.getDataArrayWithoutFirstRow();

        return bilgiler;

    };
}
