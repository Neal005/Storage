package unit_testing;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import thuvien.tinhtoan.PhepTinh;

public class TestPhepToan {
	
	private static final float delta = (float) 1e-15;
	
	//Test
	@Test(dataProvider="testCong")
	public void TestCong(float a,float b,float expected)
	{
		float reality=PhepTinh.Op('+',a,b);
		Assert.assertEquals(reality, expected, delta);
		System.out.println("Nice!!!");
	}
	
	@Test(dataProvider="testTru")
	public void TestTru(float a,float b,float expected)
	{
		float reality=PhepTinh.Op('-',a,b);
		Assert.assertEquals(reality, expected, delta);
		System.out.println("Nice!!!");
	}
	
	@Test(dataProvider="testNhan")
	public void TestNhan(float a,float b,float expected)
	{
		float reality=PhepTinh.Op('*',a,b);
		Assert.assertEquals(reality, expected, delta);
		System.out.println("Nice!!!");
	}
	
	
	//Data provider
	@DataProvider(name = "testCong")
	public Object[][] testCongProvider() {
		unit_testing.ReadExcelFile config = new unit_testing.ReadExcelFile("D:\\baithiKTPM\\Document\\Data\\TestData.xlsx");
	
	    int rows = config.getRowCount(0);
	    Object[][] data = new Object[rows][3];
	
	    for (int i = 0; i < rows; i++) {
	        data[i][0] = config.getDataFloat(0, i, 0);
	        data[i][1] = config.getDataFloat(0, i, 1);
	        data[i][2] = config.getDataFloat(0, i, 2);
	    }
	
	    return data;
	}
	
	@DataProvider(name = "testTru")
	public Object[][] testTruProvider() {
		unit_testing.ReadExcelFile config = new unit_testing.ReadExcelFile("D:\\baithiKTPM\\Document\\Data\\TestData.xlsx");
	
	    int rows = config.getRowCount(1);
	    Object[][] data = new Object[rows][3];
	
	    for (int i = 0; i < rows; i++) {
	        data[i][0] = config.getDataFloat(1, i, 0);
	        data[i][1] = config.getDataFloat(1, i, 1);
	        data[i][2] = config.getDataFloat(1, i, 2);
	    }
	
	    return data;
	}
	
	@DataProvider(name = "testNhan")
	public Object[][] testNhanProvider() {
		unit_testing.ReadExcelFile config = new unit_testing.ReadExcelFile("D:\\baithiKTPM\\Document\\Data\\TestData.xlsx");
	
	    int rows = config.getRowCount(2);
	    Object[][] data = new Object[rows][3];
	
	    for (int i = 0; i < rows; i++) {
	        data[i][0] = (float) config.getDataDouble(2, i, 0);
	        data[i][1] = (float) config.getDataDouble(2, i, 1);
	        data[i][2] = (float) config.getDataDouble(2, i, 2);
	    }
	
	    return data;
	}
}
