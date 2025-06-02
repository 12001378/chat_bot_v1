package com.membership.chat_bot.service;

import com.membership.chat_bot.payload.TraningDTO;

import java.util.List;

public interface TrainedQAService {

    public TraningDTO trainQA(TraningDTO traningDTO) throws Exception;

    public List<TraningDTO> trainQAList() throws Exception;
}
