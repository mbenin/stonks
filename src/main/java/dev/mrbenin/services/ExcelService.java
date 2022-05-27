package dev.mrbenin.services;

import java.util.List;
import java.util.Map;

public interface ExcelService {
    public Map<Integer, List<String>> readExcel(String filePath);
}
