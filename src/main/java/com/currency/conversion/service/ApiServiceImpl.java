package com.currency.conversion.service;

import com.currency.conversion.delegate.PartnerApi;
import com.currency.conversion.model.ConvertRes;
import com.currency.conversion.model.CurrencyConversionRes;
import com.currency.conversion.model.CurrencySymbolRes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApiServiceImpl implements ApiService {
    private static final Logger logger = LoggerFactory.getLogger(ApiServiceImpl.class);

    @Autowired
    PartnerApi partnerApi;

    /**
     * Get all currency rate information
     *
     * @return list of string
     */
    @Override
    public List<String> getSymbols() {
        List<String> ret = new ArrayList<>();
        CurrencySymbolRes dataP = null;
        Map<String, Double> rates = null;
        try {
            Object data = partnerApi.callExchangeLatest();
            ObjectMapper mapper = new ObjectMapper();
            dataP = mapper.readValue(mapper.writeValueAsString(data), CurrencySymbolRes.class);
            rates = mapper.readValue(mapper.writeValueAsString(dataP.getRates()), new TypeReference<HashMap<String, Double>>() {
            });
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        if (rates != null) {
            for (Map.Entry<String, Double> r : rates.entrySet()) {
                if(r.getValue() > 0) {
                    ret.add(r.getKey());
                }
            }
        }

        return ret;
    }

    /**
     * Get currency converted data
     *
     * @param from string
     * @param to string
     * @param amount string
     * @return ConvertRes
     */
    @Override
    public ConvertRes getCurrencyConverted(String from, String to, String amount) {
        ConvertRes ret = new ConvertRes();
        CurrencyConversionRes dataP = null;
        try {
            Object data = partnerApi.callExchangeConvert(from, to, amount);
            ObjectMapper mapper = new ObjectMapper();
            dataP = mapper.readValue(mapper.writeValueAsString(data), CurrencyConversionRes.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        if (dataP != null && dataP.getQuery() != null) {
            if (dataP.getQuery().getFrom() != null) ret.setSourceCurrency(dataP.getQuery().getFrom());
            if (dataP.getQuery().getTo() != null) ret.setTargetCurrency(dataP.getQuery().getTo());
            if (dataP.getQuery().getAmount() > 0) ret.setSourceAmount(String.valueOf(dataP.getQuery().getAmount()));
            if (dataP.getResult() > 0) ret.setTargetAmount(String.valueOf(dataP.getResult()));
        }
        return ret;
    }
}
