package com.example.csvparser;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {

    public List<CsvData> parseCsv(String csvFilePath) throws IOException {
        List<CsvData> dataList = new ArrayList<>();
        try (FileReader reader = new FileReader(csvFilePath)) {
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withHeader()
                    .withSkipHeaderRecord()  // Skip the header
                    .parse(reader);

            for (CSVRecord record : records) {
                CsvData data = new CsvData();
                data.setPeriodId(record.get("PERIOD_ID"));
                data.setGgrphclRegionId(record.get("GGRPHCL_REGION_ID"));
                data.setDataItemId(record.get("DATA_ITEM_ID"));
                data.setDimension1LkupId(record.get("DIMENSION1_LKUP_ID"));
                data.setDimension2LkupId(record.get("DIMENSION2_LKUP_ID"));
                data.setDimension3LkupId(record.get("DIMENSION3_LKUP_ID"));
                data.setDimension4LkupId(record.get("DIMENSION4_LKUP_ID"));
                data.setDimension5LkupId(record.get("DIMENSION5_LKUP_ID"));
                data.setPointEstimateSupply(Double.parseDouble(record.get("POINT_ESTIMATE_SUPPLY")));
                data.setPointEstimateDemand(Double.parseDouble(record.get("POINT_ESTIMATE_DEMAND")));
                data.setGap(Double.parseDouble(record.get("GAP")));
                data.setUnmetDemandLow(Double.parseDouble(record.get("UNMET_DEMAND_LOW")));
                data.setUnmetDemandGapLowCol(Double.parseDouble(record.get("UNMET_DEMAND_GAP_LOW_COL")));
                data.setUnmetDemandGapLow(Double.parseDouble(record.get("UNMET_DEMAND_GAP_LOW")));
                data.setUnmetDemandHigh(Double.parseDouble(record.get("UNMET_DEMAND_HIGH")));
                data.setUnmetDemandGapHighCol(Double.parseDouble(record.get("UNMET_DEMAND_GAP_HIGH_COL")));
                data.setUnmetDemandGapHigh(Double.parseDouble(record.get("UNMET_DEMAND_GAP_HIGH")));
                data.setAssmptnValue(Double.parseDouble(record.get("ASSMPTN_VALUE")));
                data.setAssmptnValuePct(Double.parseDouble(record.get("ASSMPTN_VALUE_PCT")));

                dataList.add(data);
            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        CsvParser parser = new CsvParser();

        // Record the start time
        long startTime = System.nanoTime();

        try {
            // Replace with your file path to test
            List<CsvData> data = parser.parseCsv("src/main/resources/sample_1000000.csv");

            // Record the end time
            long endTime = System.nanoTime();

            // Calculate the elapsed time in milliseconds
            long elapsedTime = (endTime - startTime) / 1_000_000; // Convert from nanoseconds to milliseconds

            // Print the result
            System.out.println("CSV Parsing Completed in " + elapsedTime + " milliseconds");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}