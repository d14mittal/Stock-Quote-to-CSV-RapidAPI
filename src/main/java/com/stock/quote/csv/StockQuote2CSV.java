package com.stock.quote.csv;

import com.stock.quote.csv.convertor.JsonToQuote;
import com.stock.quote.csv.model.ResponseDto;
import com.stock.quote.csv.service.GenerateCSV;
import com.stock.quote.csv.service.RestAPI;
import org.apache.hc.core5.http.HttpStatus;

import java.io.IOException;
import java.net.http.HttpResponse;

/**
 * Hello world!
 *
 */
public class StockQuote2CSV
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        RestAPI restAPI = new RestAPI();
        JsonToQuote jsonToObject = new JsonToQuote();
        HttpResponse<String> response = restAPI.getStockData();
        if(response.statusCode() == HttpStatus.SC_OK){
            ResponseDto responseDto = jsonToObject.jsonToJavaObjects(response);
            GenerateCSV generateCSV = new GenerateCSV();
            generateCSV.writeToCSV(responseDto);
        }
        else{
            System.out.println("Error occurred while getting response, HTTP_STATUS_CODE: " + response.statusCode());
        }

    }
}
