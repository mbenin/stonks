package dev.mrbenin.services.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import dev.mrbenin.services.ExcelService;

public class ExcelServiceImpl implements ExcelService {

    public static final Logger logger = LogManager.getLogger(ExcelServiceImpl.class);

    @Override
    public Map<Integer, List<String>> readExcel(String filePath) {
        
        try { 
            FileInputStream file = new FileInputStream(new File(filePath));

            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);

            Map<Integer,List<String>> data = new HashMap<>();

            int i = 0;
            for(Row row : sheet) {
                data.put(i, new ArrayList<String>());
                for(Cell cell : row) {
                    if(!cell.toString().equals("")) {
                        data.get(i).add(cell.toString());               
                    } 
                }
                i++;
            }
            workbook.close();
            return data;
        } catch (FileNotFoundException e) {
            logger.error("Arquivo não encontrado", e);
        } catch (IOException e) {
            logger.error("Erro de IO", e); 
        }
        
        return null;
    }


    
}
