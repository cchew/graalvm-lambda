package com.example.csvparser;

public class CsvData {
    private String periodId;
    private String ggrphclRegionId;
    private String dataItemId;
    private String dimension1LkupId;
    private String dimension2LkupId;
    private String dimension3LkupId;
    private String dimension4LkupId;
    private String dimension5LkupId;
    private double pointEstimateSupply;
    private double pointEstimateDemand;
    private double gap;
    private double unmetDemandLow;
    private double unmetDemandGapLowCol;
    private double unmetDemandGapLow;
    private double unmetDemandHigh;
    private double unmetDemandGapHighCol;
    private double unmetDemandGapHigh;
    private double assmptnValue;
    private double assmptnValuePct;

    // Getters and Setters
    public String getPeriodId() {
        return periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public String getGgrphclRegionId() {
        return ggrphclRegionId;
    }

    public void setGgrphclRegionId(String ggrphclRegionId) {
        this.ggrphclRegionId = ggrphclRegionId;
    }

    public String getDataItemId() {
        return dataItemId;
    }

    public void setDataItemId(String dataItemId) {
        this.dataItemId = dataItemId;
    }

    public String getDimension1LkupId() {
        return dimension1LkupId;
    }

    public void setDimension1LkupId(String dimension1LkupId) {
        this.dimension1LkupId = dimension1LkupId;
    }

    public String getDimension2LkupId() {
        return dimension2LkupId;
    }

    public void setDimension2LkupId(String dimension2LkupId) {
        this.dimension2LkupId = dimension2LkupId;
    }

    public String getDimension3LkupId() {
        return dimension3LkupId;
    }

    public void setDimension3LkupId(String dimension3LkupId) {
        this.dimension3LkupId = dimension3LkupId;
    }

    public String getDimension4LkupId() {
        return dimension4LkupId;
    }

    public void setDimension4LkupId(String dimension4LkupId) {
        this.dimension4LkupId = dimension4LkupId;
    }

    public String getDimension5LkupId() {
        return dimension5LkupId;
    }

    public void setDimension5LkupId(String dimension5LkupId) {
        this.dimension5LkupId = dimension5LkupId;
    }

    public double getPointEstimateSupply() {
        return pointEstimateSupply;
    }

    public void setPointEstimateSupply(double pointEstimateSupply) {
        this.pointEstimateSupply = pointEstimateSupply;
    }

    public double getPointEstimateDemand() {
        return pointEstimateDemand;
    }

    public void setPointEstimateDemand(double pointEstimateDemand) {
        this.pointEstimateDemand = pointEstimateDemand;
    }

    public double getGap() {
        return gap;
    }

    public void setGap(double gap) {
        this.gap = gap;
    }

    public double getUnmetDemandLow() {
        return unmetDemandLow;
    }

    public void setUnmetDemandLow(double unmetDemandLow) {
        this.unmetDemandLow = unmetDemandLow;
    }

    public double getUnmetDemandGapLowCol() {
        return unmetDemandGapLowCol;
    }

    public void setUnmetDemandGapLowCol(double unmetDemandGapLowCol) {
        this.unmetDemandGapLowCol = unmetDemandGapLowCol;
    }

    public double getUnmetDemandGapLow() {
        return unmetDemandGapLow;
    }

    public void setUnmetDemandGapLow(double unmetDemandGapLow) {
        this.unmetDemandGapLow = unmetDemandGapLow;
    }

    public double getUnmetDemandHigh() {
        return unmetDemandHigh;
    }

    public void setUnmetDemandHigh(double unmetDemandHigh) {
        this.unmetDemandHigh = unmetDemandHigh;
    }

    public double getUnmetDemandGapHighCol() {
        return unmetDemandGapHighCol;
    }

    public void setUnmetDemandGapHighCol(double unmetDemandGapHighCol) {
        this.unmetDemandGapHighCol = unmetDemandGapHighCol;
    }

    public double getUnmetDemandGapHigh() {
        return unmetDemandGapHigh;
    }

    public void setUnmetDemandGapHigh(double unmetDemandGapHigh) {
        this.unmetDemandGapHigh = unmetDemandGapHigh;
    }

    public double getAssmptnValue() {
        return assmptnValue;
    }

    public void setAssmptnValue(double assmptnValue) {
        this.assmptnValue = assmptnValue;
    }

    public double getAssmptnValuePct() {
        return assmptnValuePct;
    }

    public void setAssmptnValuePct(double assmptnValuePct) {
        this.assmptnValuePct = assmptnValuePct;
    }

    @Override
    public String toString() {
        return "CsvData{" +
                "periodId='" + periodId + '\'' +
                ", ggrphclRegionId='" + ggrphclRegionId + '\'' +
                ", dataItemId='" + dataItemId + '\'' +
                ", dimension1LkupId='" + dimension1LkupId + '\'' +
                ", dimension2LkupId='" + dimension2LkupId + '\'' +
                ", dimension3LkupId='" + dimension3LkupId + '\'' +
                ", dimension4LkupId='" + dimension4LkupId + '\'' +
                ", dimension5LkupId='" + dimension5LkupId + '\'' +
                ", pointEstimateSupply=" + pointEstimateSupply +
                ", pointEstimateDemand=" + pointEstimateDemand +
                ", gap=" + gap +
                ", unmetDemandLow=" + unmetDemandLow +
                ", unmetDemandGapLowCol=" + unmetDemandGapLowCol +
                ", unmetDemandGapLow=" + unmetDemandGapLow +
                ", unmetDemandHigh=" + unmetDemandHigh +
                ", unmetDemandGapHighCol=" + unmetDemandGapHighCol +
                ", unmetDemandGapHigh=" + unmetDemandGapHigh +
                ", assmptnValue=" + assmptnValue +
                ", assmptnValuePct=" + assmptnValuePct +
                '}';
    }
}