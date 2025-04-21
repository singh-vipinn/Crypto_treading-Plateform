package com.vstech.service;

import com.vstech.model.CoinDTO;
import com.vstech.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
