package com.stock.quote.csv.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalQuote {

  @JsonProperty("01. symbol")
  private String symbol;

  @JsonProperty("02. open")
  private String open;

  @JsonProperty("03. high")
  private String high;

  @JsonProperty("04. low")
  private String low;

  @JsonProperty("05. price")
  private String price;

  @JsonProperty("06. volume")
  private String volume;

  @JsonProperty("07. latest trading day")
  private String latestTradingDay;

  @JsonProperty("08. previous close")
  private String previousClose;

  @JsonProperty("09. change")
  private String change;

  @JsonProperty("10. change percent")
  private String changePercentage;

  public GlobalQuote() {
    super();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
  }

  @Override
  public String toString() {
    return "GlobalQuote{"
        + "symbol='"
        + symbol
        + '\''
        + ", open='"
        + open
        + '\''
        + ", high='"
        + high
        + '\''
        + ", low='"
        + low
        + '\''
        + ", price='"
        + price
        + '\''
        + ", volume='"
        + volume
        + '\''
        + ", latestTradingDay='"
        + latestTradingDay
        + '\''
        + ", previousClose='"
        + previousClose
        + '\''
        + ", change='"
        + change
        + '\''
        + ", changePercentage='"
        + changePercentage
        + '\''
        + '}';
  }

  public GlobalQuote(
      String symbol,
      String open,
      String high,
      String low,
      String price,
      String volume,
      String latestTradingDay,
      String previousClose,
      String change,
      String changePercentage) {
    this.symbol = symbol;
    this.open = open;
    this.high = high;
    this.low = low;
    this.price = price;
    this.volume = volume;
    this.latestTradingDay = latestTradingDay;
    this.previousClose = previousClose;
    this.change = change;
    this.changePercentage = changePercentage;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getOpen() {
    return open;
  }

  public String getHigh() {
    return high;
  }

  public String getLow() {
    return low;
  }

  public String getPrice() {
    return price;
  }

  public String getVolume() {
    return volume;
  }

  public String getLatestTradingDay() {
    return latestTradingDay;
  }

  public String getPreviousClose() {
    return previousClose;
  }

  public String getChange() {
    return change;
  }

  public String getChangePercentage() {
    return changePercentage;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public void setOpen(String open) {
    this.open = open;
  }

  public void setHigh(String high) {
    this.high = high;
  }

  public void setLow(String low) {
    this.low = low;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

  public void setLatestTradingDay(String latestTradingDay) {
    this.latestTradingDay = latestTradingDay;
  }

  public void setPreviousClose(String previousClose) {
    this.previousClose = previousClose;
  }

  public void setChange(String change) {
    this.change = change;
  }

  public void setChangePercentage(String changePercentage) {
    this.changePercentage = changePercentage;
  }
}
