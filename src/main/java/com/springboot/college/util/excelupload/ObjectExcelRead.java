package com.springboot.college.util.excelupload;
import org.apache.poi.hssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * Excel读取工具
 */
public class ObjectExcelRead {

    /**
     *  根据文件路径 + 文件名找到excel并读取内容到list
     * @param filepath //文件路径
     * @param filename //文件名
     * @param startrow //开始行号
     * @param startcol //开始列号
     * @param sheetnum //sheet
     * @return list
     */
    public static List<Object> readExcel(String filepath, String filename, int startrow, int startcol, int sheetnum) {
        File excelFile = new File(filepath, filename);
        List<Object> varList = operateExcelFile(excelFile, startrow, startcol, sheetnum);
        return varList;
    }

    /**
     *  根据文件位置找到excel并读取内容到list
     * @param targetPath //文件位置
     * @param startrow //开始行号
     * @param startcol //开始列号
     * @param sheetnum //sheet
     * @return list
     */
    public static List<Object> readExcel(String targetPath, int startrow, int startcol, int sheetnum) {
        File excelFile = new File(targetPath);
        List<Object> varList = operateExcelFile(excelFile, startrow, startcol, sheetnum);
        return varList;
    }

    /**
     *  根据excel文件对象读取内容到list
     * @param excelFile //excel文件对象
     * @param startrow //开始行号
     * @param startcol //开始列号
     * @param sheetnum //sheet
     * @return list
     */
    public static List<Object> readExcel(File excelFile, int startrow, int startcol, int sheetnum) {
        List<Object> varList = operateExcelFile(excelFile, startrow, startcol, sheetnum);
        return varList;
    }

    @SuppressWarnings({ "deprecation", "resource" })
    private static List<Object> operateExcelFile(File excelFile, int startrow, int startcol, int sheetnum) {
        List<Object> varList = new ArrayList<Object>();
        try {
            FileInputStream fi = new FileInputStream(excelFile);
            HSSFWorkbook wb = new HSSFWorkbook(fi);
            HSSFSheet sheet = wb.getSheetAt(sheetnum); 					//sheet 从0开始
            int rowNum = sheet.getLastRowNum() + 1; 					//取得最后一行的行号

            for (int i = startrow; i < rowNum; i++) {					//行循环开始

                PageData varpd = new PageData();
                HSSFRow row = sheet.getRow(i); 							//行
                int cellNum = row.getLastCellNum(); 					//每行的最后一个单元格位置

                for (int j = startcol; j < cellNum; j++) {				//列循环开始

                    HSSFCell cell = row.getCell(Short.parseShort(j + ""));
                    String cellValue = null;
                    if (null != cell) {
                        switch (cell.getCellType()) { 					// 判断excel单元格内容的格式，并对其进行转换，以便插入数据库
                            case NUMERIC:
                                if(HSSFDateUtil.isCellDateFormatted(cell)){
                                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                    cellValue = sdf.format(HSSFDateUtil.getJavaDate(cell.getNumericCellValue())).toString();
                                } else if(String.valueOf(cell.getNumericCellValue()).indexOf("E")==-1){
                                    cellValue = String.valueOf((int) cell.getNumericCellValue());
                                } else{
                                    cellValue = new DecimalFormat("#").format(cell.getNumericCellValue());
                                }
                                break;
                            case STRING:
                                cellValue = cell.getStringCellValue();
                                break;
                            case FORMULA:
                                cellValue = cell.getNumericCellValue() + "";
                                // cellValue = String.valueOf(cell.getDateCellValue());
                                break;
                            case BLANK:
                                cellValue = "";
                                break;
                            case BOOLEAN:
                                cellValue = String.valueOf(cell.getBooleanCellValue());
                                break;
                            case ERROR:
                                cellValue = String.valueOf(cell.getErrorCellValue());
                                break;
                        }
                    } else {
                        cellValue = "";
                    }

                    varpd.put("var"+j, cellValue);

                }
                varList.add(varpd);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return varList;
    }

    /**
     * @param filepath //文件路径
     * @param filename //文件名
     * @param startrow //开始行号
     * @param startcol //开始列号
     * @param sheetnum //sheet
     * @return list
     */
    @SuppressWarnings({ "resource", "deprecation" })
    public static List<Object> readExcelLine(String filepath, String filename, int startrow, int startcol, int sheetnum) {
        List<Object> varList = new ArrayList<Object>();

        try {
            File target = new File(filepath, filename);
            FileInputStream fi = new FileInputStream(target);
            HSSFWorkbook wb = new HSSFWorkbook(fi);
            HSSFSheet sheet = wb.getSheetAt(sheetnum); 					//sheet 从0开始
            int rowNum = startrow + 1; 					//取得最后一行的行号

            for (int i = startrow; i < rowNum; i++) {					//行循环开始

               PageData varpd = new PageData();
                HSSFRow row = sheet.getRow(i); 							//行
                int cellNum = row.getLastCellNum(); 					//每行的最后一个单元格位置

                for (int j = startcol; j < cellNum; j++) {				//列循环开始

                    HSSFCell cell = row.getCell(Short.parseShort(j + ""));
                    String cellValue = null;
                    if (null != cell) {
                        switch (cell.getCellType()) { 					// 判断excel单元格内容的格式，并对其进行转换，以便插入数据库
                            case NUMERIC:
                                if(HSSFDateUtil.isCellDateFormatted(cell)){
                                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                    cellValue = sdf.format(HSSFDateUtil.getJavaDate(cell.getNumericCellValue())).toString();
                                }else{
                                    cellValue = String.valueOf((int) cell.getNumericCellValue());
                                }
                                break;
                            case STRING:
                                cellValue = cell.getStringCellValue();
                                break;
                            case FORMULA:
                                cellValue = cell.getNumericCellValue() + "";
                                // cellValue = String.valueOf(cell.getDateCellValue());
                                break;
                            case BLANK:
                                cellValue = "";
                                break;
                            case BOOLEAN:
                                cellValue = String.valueOf(cell.getBooleanCellValue());
                                break;
                            case ERROR:
                                cellValue = String.valueOf(cell.getErrorCellValue());
                                break;
                        }
                    } else {
                        cellValue = "";
                    }

                    varpd.put("var"+j, cellValue);

                }
                varList.add(varpd);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return varList;
    }

    @SuppressWarnings({ "resource", "deprecation" })
    public static List<Object> readExcelDetail(String filepath, String filename, int startrow, int startcol, int sheetnum) {
        List<Object> varList = new ArrayList<Object>();

        try {
            File target = new File(filepath, filename);
            FileInputStream fi = new FileInputStream(target);
            HSSFWorkbook wb = new HSSFWorkbook(fi);
            HSSFSheet sheet = wb.getSheetAt(sheetnum); 					//sheet 从0开始
            int rowNum = sheet.getLastRowNum() + 1; 					//取得最后一行的行号

            for (int i = startrow; i < rowNum; i++) {					//行循环开始

                PageData varpd = new PageData();
                HSSFRow row = sheet.getRow(i); 							//行
                int cellNum = row.getLastCellNum(); 					//每行的最后一个单元格位置

                for (int j = startcol; j < cellNum; j++) {				//列循环开始

                    HSSFCell cell = row.getCell(Short.parseShort(j + ""));
                    String cellValue = null;
                    if (null != cell) {
                        switch (cell.getCellType()) { 					// 判断excel单元格内容的格式，并对其进行转换，以便插入数据库
                            case NUMERIC:
                                if(HSSFDateUtil.isCellDateFormatted(cell)){
                                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                                    cellValue = sdf.format(HSSFDateUtil.getJavaDate(cell.getNumericCellValue())).toString();
                                }else{
                                    cellValue = String.valueOf((float) cell.getNumericCellValue());
                                }
                                break;
                            case STRING:
                                cellValue = cell.getStringCellValue();
                                break;
                            case FORMULA:
                                cellValue = cell.getNumericCellValue() + "";
                                // cellValue = String.valueOf(cell.getDateCellValue());
                                break;
                            case BLANK:
                                cellValue = "";
                                break;
                            case BOOLEAN:
                                cellValue = String.valueOf(cell.getBooleanCellValue());
                                break;
                            case ERROR:
                                cellValue = String.valueOf(cell.getErrorCellValue());
                                break;
                        }
                    } else {
                        cellValue = "";
                    }

                    varpd.put("var"+j, cellValue);

                }
                varList.add(varpd);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return varList;
    }

}
