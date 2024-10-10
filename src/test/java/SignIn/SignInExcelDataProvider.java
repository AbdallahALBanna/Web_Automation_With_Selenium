package SignIn;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SignInExcelDataProvider {

    @DataProvider(name = "sginInExcelDataProvider")
    public Object[][] sginInExcelDataProvider() throws IOException {

        String sginInExcelFilePath = "src/test/java/SignIn/SignInDataFile.xlsx";
        FileInputStream fis = new FileInputStream(new File(sginInExcelFilePath));

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet0");

        int rowCount = sheet.getPhysicalNumberOfRows();
        int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] signInData = new Object[rowCount - 1][columnCount];

        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(1);
            for (int j = 0; j < columnCount; j++) {
                Cell cell = row.getCell(j);

                signInData[i - 1][j] = cell.getStringCellValue();
            }

        }

        workbook.close();
        fis.close();
        return signInData;
    }


}
