package com.stock.quote.csv.convertor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stock.quote.csv.model.GlobalQuote;
import com.stock.quote.csv.model.ResponseDto;

import java.io.IOException;
import java.net.http.HttpResponse;

public class JsonToQuote {

    public ResponseDto jsonToJavaObjects(HttpResponse<String> httpResponse) throws IOException {

        String jsonBody = httpResponse.body();
        ObjectMapper objectMapper = new ObjectMapper();
        GlobalQuote globalQuote = new GlobalQuote();
        return objectMapper.readValue(jsonBody, ResponseDto.class);


    }
}
