package com.stock.quote.csv.service;

import com.stock.quote.csv.constants.StockQuoteConstants;
import com.stock.quote.csv.model.GlobalQuote;
import com.stock.quote.csv.model.ResponseDto;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateCSV {

    public void writeToCSV(ResponseDto responseDto) throws IOException {
        String csvFileName = StockQuoteConstants.CSV_FIL_PATH;

        try (FileWriter fileWriter = new FileWriter(csvFileName)) {

            fileWriter.write("Symbol,Open,High,Low,Price,Volume,TradingDay,PreviousClose,Change,ChangePercent\n");

            GlobalQuote globalQuote = responseDto.getGlobalQuote();

            String symbol = globalQuote.getSymbol();
            String open = globalQuote.getOpen();
            String high = globalQuote.getHigh();
            String low = globalQuote.getLow();
            String price = globalQuote.getPrice();
            String volume = globalQuote.getVolume();
            String latestTradingDay = globalQuote.getLatestTradingDay();
            String previousClose = globalQuote.getPreviousClose();
            String change = globalQuote.getChange();
            String changePercentage = globalQuote.getChangePercentage();


            fileWriter.write(symbol + "," + open + "," + high + "," + low + "," + price + "," + volume + "," + latestTradingDay + "," + previousClose + "," + change + "," + changePercentage);
        } catch (IOException e) {
            System.out.println("Error occurred " + e.getMessage());
        }


    }


}
