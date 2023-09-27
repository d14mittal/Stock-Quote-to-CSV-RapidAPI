package com.stock.quote.csv.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDto {

    @JsonProperty("Global Quote")
    private GlobalQuote globalQuote;

    public void setGlobalQuote(GlobalQuote globalQuote) {
        this.globalQuote = globalQuote;
    }

    public GlobalQuote getGlobalQuote() {
        return globalQuote;
    }



}
