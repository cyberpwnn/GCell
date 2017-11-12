package org.cyberpwn.gcell;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI
{
	public static XSSFWorkbook loadXSSFWorkbook(File f) throws IOException, InvalidFormatException
	{
		return new XSSFWorkbook(f);
	}

	public static void saveWorkbook(Workbook wb, File f) throws IOException
	{
		FileOutputStream outputStream = new FileOutputStream(f);
		wb.write(outputStream);
		wb.close();
	}
}
